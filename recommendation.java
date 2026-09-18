public class recommendation {

    private game game;
    private int score;

    public recommendation(game game, int score) {
        this.game = game;
        this.score = score;
    }

    public game getGame() {
        return game;
    }

    public int getScore() {
        return score;
    }

    public void display() {

        System.out.println(
                game.getName() +
                        " | Rating: " +
                        game.getRating() +
                        " | Match Score: " +
                        score + "%"
        );
    }
}
