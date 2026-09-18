import java.util.List;
import java.util.Scanner;

public class Main {

    // Scanner
    private static final Scanner scanner = new Scanner(System.in);

    // Database
    private static final gamedatabase database = new gamedatabase();

    // Recommendation engine
    private static final RecommendationEngine engine =
            new RecommendationEngine();

    // Feedback manager
    private static final FeedbackManager feedbackManager =
            new FeedbackManager();


    // =====================================================
    // MAIN
    // =====================================================

    public static void main(String[] args) {

        System.out.println();
        System.out.println("==============================================");
        System.out.println("          GAME RECOMMENDATION SYSTEM");
        System.out.println("==============================================");
        System.out.println("              Welcome to GameMatch");
        System.out.println("==============================================");

        boolean running = true;

        while (running) {

            showMenu();

            int choice = readInt("Enter your choice: ");

            switch (choice) {

                case 1:
                    getRecommendations();
                    break;

                case 2:
                    database.displayAllGames();
                    break;

                case 3:
                    searchGame();
                    break;

                case 4:
                    giveFeedback();
                    break;

                case 5:
                    feedbackManager.displayFeedback();
                    break;

                case 6:
                    showStatistics();
                    break;

                case 7:
                    running = false;
                    System.out.println();
                    System.out.println("==============================================");
                    System.out.println("       Thank you for using GameMatch!");
                    System.out.println("==============================================");
                    break;

                default:
                    System.out.println();
                    System.out.println("Invalid choice.");
                    System.out.println("Please enter a number from 1 to 7.");
            }
        }

        scanner.close();
    }


    // =====================================================
    // MENU
    // =====================================================

    private static void showMenu() {

        System.out.println();
        System.out.println("============== MAIN MENU ==============");
        System.out.println("1. Get Game Recommendations");
        System.out.println("2. View All Games");
        System.out.println("3. Search Game");
        System.out.println("4. Give Feedback");
        System.out.println("5. View My Feedback");
        System.out.println("6. Database Statistics");
        System.out.println("7. Exit");
        System.out.println("========================================");
    }


    // =====================================================
    // RECOMMENDATIONS
    // =====================================================

    private static void getRecommendations() {

        System.out.println();
        System.out.println("========== GAME RECOMMENDATION ==========");

        // Name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine().trim();

        if (name.isEmpty()) {
            name = "User";
        }


        // Genre
        System.out.println();
        System.out.println("Available Genres:");
        System.out.println("------------------------------------------");
        System.out.println("Action");
        System.out.println("Adventure");
        System.out.println("RPG");
        System.out.println("Sports");
        System.out.println("Racing");
        System.out.println("Shooter");
        System.out.println("Horror");
        System.out.println("Strategy");
        System.out.println("Simulation");
        System.out.println("Fighting");
        System.out.println("Indie");
        System.out.println("Any");

        System.out.print("\nEnter preferred genre: ");
        String genre = scanner.nextLine().trim();

        if (genre.isEmpty()) {
            genre = "Any";
        }


        // Platform
        System.out.println();
        System.out.println("Available Platforms:");
        System.out.println("------------------------------------------");
        System.out.println("PC");
        System.out.println("Xbox");
        System.out.println("PlayStation");
        System.out.println("Any");

        System.out.print("\nEnter preferred platform: ");
        String platform = scanner.nextLine().trim();

        if (platform.isEmpty()) {
            platform = "Any";
        }


        // Mode
        System.out.println();
        System.out.println("Available Game Modes:");
        System.out.println("------------------------------------------");
        System.out.println("Singleplayer");
        System.out.println("Multiplayer");
        System.out.println("Any");

        System.out.print("\nEnter preferred mode: ");
        String mode = scanner.nextLine().trim();

        if (mode.isEmpty()) {
            mode = "Any";
        }


        // Budget
        double maxPrice = readDouble(
                "\nEnter maximum budget (₹): "
        );


        // Generate recommendations
        List<game> recommendations;

        try {

            recommendations = engine.recommend(
                    database.getGames(),
                    genre,
                    platform,
                    mode,
                    maxPrice,
                    feedbackManager
            );

        } catch (Exception e) {

            System.out.println();
            System.out.println(
                    "Error generating recommendations."
            );

            System.out.println(
                    "Check your RecommendationEngine.java."
            );

            return;
        }


        // Results
        System.out.println();
        System.out.println(
                "========== RECOMMENDATIONS FOR "
                        + name.toUpperCase()
                        + " =========="
        );


        if (recommendations.isEmpty()) {

            System.out.println();
            System.out.println(
                    "No games matched your preferences."
            );

            System.out.println();
            System.out.println(
                    "Try:"
            );

            System.out.println(
                    "- Increasing your budget"
            );

            System.out.println(
                    "- Selecting 'Any' for platform"
            );

            System.out.println(
                    "- Selecting 'Any' for game mode"
            );

            return;
        }


        int count = 0;


        for (game g : recommendations) {

            count++;

            double score;

            try {

                score = engine.getScore(
                        g,
                        genre,
                        platform,
                        mode,
                        maxPrice,
                        feedbackManager
                );

            } catch (Exception e) {

                score = 0;
            }


            System.out.println();
            System.out.println(
                    "--------------- #" + count + " ---------------"
            );

            System.out.println(
                    "Game       : " + g.getName()
            );

            System.out.println(
                    "Genre      : " + g.getGenre()
            );

            System.out.println(
                    "Platform   : " + g.getPlatform()
            );

            System.out.println(
                    "Mode       : " + g.getMode()
            );

            System.out.println(
                    "Release    : " + g.getYear()
            );

            System.out.printf(
                    "Rating     : %.1f/10%n",
                    g.getRating()
            );

            System.out.printf(
                    "Price      : ₹%.0f%n",
                    g.getPrice()
            );

            System.out.printf(
                    "Match Score: %.2f/100%n",
                    score
            );


            // Feedback status
            if (feedbackManager.userLikes(g.getName())) {

                System.out.println(
                        "Feedback   : You liked this game"
                );
            }

            if (feedbackManager.userDislikes(g.getName())) {

                System.out.println(
                        "Feedback   : You disliked this game"
                );
            }


            // Only top 10
            if (count >= 10) {
                break;
            }
        }


        System.out.println();
        System.out.println(
                "=========================================="
        );

        System.out.println(
                "Top " +
                        Math.min(10, recommendations.size()) +
                        " recommendations displayed."
        );
    }


    // =====================================================
    // SEARCH
    // =====================================================

    private static void searchGame() {

        System.out.println();
        System.out.println("============== SEARCH GAME ==============");

        System.out.print(
                "Enter game name or genre: "
        );

        String keyword =
                scanner.nextLine().trim();


        if (keyword.isEmpty()) {

            System.out.println(
                    "Search cannot be empty."
            );

            return;
        }


        List<game> results =
                database.search(keyword);


        System.out.println();
        System.out.println("============== SEARCH RESULTS ==============");


        if (results.isEmpty()) {

            System.out.println(
                    "No games found for: " + keyword
            );

            return;
        }


        for (game g : results) {

            System.out.println();
            System.out.println("--------------------------------------------");

            System.out.println(
                    "ID       : " + g.getId()
            );

            System.out.println(
                    "Game     : " + g.getName()
            );

            System.out.println(
                    "Genre    : " + g.getGenre()
            );

            System.out.println(
                    "Platform : " + g.getPlatform()
            );

            System.out.println(
                    "Mode     : " + g.getMode()
            );

            System.out.println(
                    "Year     : " + g.getYear()
            );

            System.out.printf(
                    "Rating   : %.1f/10%n",
                    g.getRating()
            );

            System.out.printf(
                    "Price    : ₹%.0f%n",
                    g.getPrice()
            );
        }


        System.out.println();
        System.out.println(
                "Total results: " + results.size()
        );
    }


    // =====================================================
    // FEEDBACK
    // =====================================================

    private static void giveFeedback() {

        System.out.println();
        System.out.println("============== GIVE FEEDBACK ==============");

        System.out.print(
                "Enter exact game name: "
        );

        String gameName =
                scanner.nextLine().trim();


        if (gameName.isEmpty()) {

            System.out.println(
                    "Game name cannot be empty."
            );

            return;
        }


        List<game> results =
                database.search(gameName);


        game selectedGame = null;


        for (game g : results) {

            if (g.getName().equalsIgnoreCase(gameName)) {

                selectedGame = g;
                break;
            }
        }


        if (selectedGame == null) {

            System.out.println();
            System.out.println(
                    "Game not found."
            );

            System.out.println(
                    "Use option 3 to search for the exact name."
            );

            return;
        }


        System.out.println();
        System.out.println(
                "Selected Game: "
                        + selectedGame.getName()
        );

        System.out.println();
        System.out.println("1. Like");
        System.out.println("2. Dislike");
        System.out.println("3. Give Rating");
        System.out.println("4. Cancel");


        int choice =
                readInt("\nEnter your choice: ");


        switch (choice) {

            case 1:

                feedbackManager.addLike(
                        selectedGame.getName()
                );

                break;


            case 2:

                feedbackManager.addDislike(
                        selectedGame.getName()
                );

                break;


            case 3:

                double rating =
                        readDouble(
                                "Enter rating (1-10): "
                        );


                if (rating < 1 || rating > 10) {

                    System.out.println(
                            "Rating must be between 1 and 10."
                    );

                    return;
                }


                feedbackManager.addRating(
                        selectedGame.getName(),
                        rating
                );

                break;


            case 4:

                System.out.println(
                        "Feedback cancelled."
                );

                break;


            default:

                System.out.println(
                        "Invalid choice."
                );
        }
    }


    // =====================================================
    // DATABASE STATISTICS
    // =====================================================

    private static void showStatistics() {

        System.out.println();
        System.out.println(
                "========== DATABASE STATISTICS =========="
        );


        List<game> games =
                database.getGames();


        if (games.isEmpty()) {

            System.out.println(
                    "Database is empty."
            );

            return;
        }


        // Total games
        System.out.println(
                "\nTotal Games: "
                        + games.size()
        );


        // Free games
        long freeGames =
                games.stream()
                        .filter(
                                g -> g.getPrice() == 0
                        )
                        .count();


        System.out.println(
                "Free Games: "
                        + freeGames
        );


        // Average rating
        double averageRating =
                games.stream()
                        .mapToDouble(
                                game::getRating
                        )
                        .average()
                        .orElse(0);


        System.out.printf(
                "Average Rating: %.2f/10%n",
                averageRating
        );


        // Average price
        double averagePrice =
                games.stream()
                        .mapToDouble(
                                game::getPrice
                        )
                        .average()
                        .orElse(0);


        System.out.printf(
                "Average Price: ₹%.2f%n",
                averagePrice
        );


        // Highest rated
        game highestRated =
                games.stream()
                        .max(
                                (g1, g2) ->
                                        Double.compare(
                                                g1.getRating(),
                                                g2.getRating()
                                        )
                        )
                        .orElse(null);


        if (highestRated != null) {

            System.out.println();

            System.out.println(
                    "Highest Rated Game: "
                            + highestRated.getName()
            );

            System.out.printf(
                    "Highest Rating: %.1f/10%n",
                    highestRated.getRating()
            );
        }


        // Cheapest game
        game cheapest =
                games.stream()
                        .min(
                                (g1, g2) ->
                                        Double.compare(
                                                g1.getPrice(),
                                                g2.getPrice()
                                        )
                        )
                        .orElse(null);


        if (cheapest != null) {

            System.out.println();

            System.out.println(
                    "Lowest Price Game: "
                            + cheapest.getName()
            );

            System.out.printf(
                    "Lowest Price: ₹%.0f%n",
                    cheapest.getPrice()
            );
        }


        System.out.println(
                "=========================================="
        );
    }


    // =====================================================
    // INTEGER INPUT
    // =====================================================

    private static int readInt(String message) {

        while (true) {

            try {

                System.out.print(message);

                return Integer.parseInt(
                        scanner.nextLine().trim()
                );

            } catch (NumberFormatException e) {

                System.out.println(
                        "Please enter a valid integer."
                );
            }
        }
    }


    // =====================================================
    // DOUBLE INPUT
    // =====================================================

    private static double readDouble(String message) {

        while (true) {

            try {

                System.out.print(message);

                double value =
                        Double.parseDouble(
                                scanner.nextLine().trim()
                        );


                if (value >= 0) {

                    return value;
                }


                System.out.println(
                        "Value cannot be negative."
                );


            } catch (NumberFormatException e) {

                System.out.println(
                        "Please enter a valid number."
                );
            }
        }
    }
}