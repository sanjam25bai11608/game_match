public class game {

    private int id;
    private String name;
    private String genre;
    private String platform;
    private String mode;
    private double rating;
    private double price;
    private int year;

    public game(int id, String name, String genre, String platform,
                String mode, double rating, double price, int year) {

        this.id = id;
        this.name = name;
        this.genre = genre;
        this.platform = platform;
        this.mode = mode;
        this.rating = rating;
        this.price = price;
        this.year = year;
    }

    public int getId() {
        return id;
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

    public String getMode() {
        return mode;
    }

    public double getRating() {
        return rating;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return String.format(
                "%-3d %-28s %-12s %-12s %-13s Rating: %.1f  Price: ₹%.0f  Year: %d",
                id, name, genre, platform, mode, rating, price, year
        );
    }
}
