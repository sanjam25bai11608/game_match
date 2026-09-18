import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RecommendationEngine {

    public List<game> recommend(
            List<game> games,
            String preferredGenre,
            String preferredPlatform,
            String preferredMode,
            double maxPrice,
            FeedbackManager feedbackManager) {

        List<game> recommendations = new ArrayList<>();

        for (game g : games) {

            double score = calculateScore(
                    g,
                    preferredGenre,
                    preferredPlatform,
                    preferredMode,
                    maxPrice,
                    feedbackManager
            );

            if (score > 0) {
                recommendations.add(g);
            }
        }

        recommendations.sort(
                Comparator.comparingDouble(
                        g -> -calculateScore(
                                g,
                                preferredGenre,
                                preferredPlatform,
                                preferredMode,
                                maxPrice,
                                feedbackManager
                        )
                )
        );

        return recommendations;
    }

    private double calculateScore(
            game g,
            String preferredGenre,
            String preferredPlatform,
            String preferredMode,
            double maxPrice,
            FeedbackManager feedbackManager) {

        double score = 0;

        // -----------------------------
        // GENRE MATCH - 40 POINTS
        // -----------------------------
        if (preferredGenre.equalsIgnoreCase("Any")
                || g.getGenre().equalsIgnoreCase(preferredGenre)) {

            score += 40;
        }

        // -----------------------------
        // PLATFORM MATCH - 20 POINTS
        // -----------------------------
        if (preferredPlatform.equalsIgnoreCase("Any")
                || g.getPlatform().equalsIgnoreCase(preferredPlatform)) {

            score += 20;
        }

        // -----------------------------
        // MODE MATCH - 15 POINTS
        // -----------------------------
        if (preferredMode.equalsIgnoreCase("Any")
                || g.getMode().equalsIgnoreCase(preferredMode)
                || g.getMode().equalsIgnoreCase("Both")) {

            score += 15;
        }

        // -----------------------------
        // PRICE MATCH - 10 POINTS
        // -----------------------------
        if (g.getPrice() <= maxPrice) {
            score += 10;
        } else {
            return 0;
        }

        // -----------------------------
        // GAME RATING - 15 POINTS
        // -----------------------------
        score += (g.getRating() / 10.0) * 15;

        // -----------------------------
        // USER FEEDBACK
        // -----------------------------

        if (feedbackManager.userLikes(g.getName())) {

            score += 10;
        }

        if (feedbackManager.userDislikes(g.getName())) {

            score -= 20;
        }

        return Math.max(0, Math.min(score, 100));
    }

    public double getScore(
            game g,
            String genre,
            String platform,
            String mode,
            double maxPrice,
            FeedbackManager feedbackManager) {

        return calculateScore(
                g,
                genre,
                platform,
                mode,
                maxPrice,
                feedbackManager
        );
    }
}