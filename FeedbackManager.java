import java.util.ArrayList;
import java.util.List;

public class FeedbackManager {

    private final List<feedback> feedbackList = new ArrayList<>();

    public void addLike(String gameName) {

        feedbackList.add(
                new feedback(gameName, "Like", 0)
        );

        System.out.println(
                "Like saved successfully!"
        );
    }

    public void addDislike(String gameName) {

        feedbackList.add(
                new feedback(gameName, "Dislike", 0)
        );

        System.out.println(
                "Dislike saved successfully!"
        );
    }

    public void addRating(String gameName, double rating) {

        feedbackList.add(
                new feedback(gameName, "Rating", rating)
        );

        System.out.println(
                "Rating saved successfully!"
        );
    }

    public List<feedback> getFeedbackList() {
        return feedbackList;
    }

    public void displayFeedback() {

        System.out.println(
                "\n========== USER FEEDBACK =========="
        );

        if (feedbackList.isEmpty()) {

            System.out.println(
                    "No feedback available."
            );

            return;
        }

        for (feedback f : feedbackList) {
            System.out.println(f);
        }
    }

    public boolean userLikes(String gameName) {

        for (feedback f : feedbackList) {

            if (f.getGameName().equalsIgnoreCase(gameName)
                    && f.getType().equalsIgnoreCase("Like")) {

                return true;
            }
        }

        return false;
    }

    public boolean userDislikes(String gameName) {

        for (feedback f : feedbackList) {

            if (f.getGameName().equalsIgnoreCase(gameName)
                    && f.getType().equalsIgnoreCase("Dislike")) {

                return true;
            }
        }

        return false;
    }
}
