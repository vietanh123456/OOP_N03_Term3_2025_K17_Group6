public class Game {
    private int gameId;
    private String title;
    private String genre;
    private String platform;
    private String releaseDate;
    private String description;
    private String coverImage;

    public Game(int gameId, String title, String genre, String platform, String releaseDate, String description, String coverImage) {
        this.gameId = gameId;
        this.title = title;
        this.genre = genre;
        this.platform = platform;
        this.releaseDate = releaseDate;
        this.description = description;
        this.coverImage = coverImage;
    }

    public String getTitle() {
        return title;
    }

    public String getPlatform() {
        return platform;
    }

    @Override
    public String toString() {
        return title + " (" + platform + ") - " + genre;
    }
}

    
}
