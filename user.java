public class user {

    private String name;
    private String genre;
    private String platform;
    private String playStyle;
    private double minimumRating;

    public user(String name, String genre, String platform,
                String playStyle, double minimumRating) {

        this.name = name;
        this.genre = genre;
        this.platform = platform;
        this.playStyle = playStyle;
        this.minimumRating = minimumRating;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public String getPlatform() {
        return platform;
    }

    public String getPlayStyle() {
        return playStyle;
    }

    public double getMinimumRating() {
        return minimumRating;
    }
}
