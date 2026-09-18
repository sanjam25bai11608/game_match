public class feedback {

    private String gameName;
    private String type;
    private double rating;

    public feedback(String gameName, String type, double rating) {
        this.gameName = gameName;
        this.type = type;
        this.rating = rating;
    }

    public String getGameName() {
        return gameName;
    }

    public String getType() {
        return type;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        if (type.equalsIgnoreCase("Rating")) {
            return gameName + " -> " + type + ": " + rating + "/10";
        }

        return gameName + " -> " + type;
    }
}