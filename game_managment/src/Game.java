import java.time.LocalDate;

public class Game {
    private int game_id;
    private String title;
    private String genre;
    private LocalDate release_date;
    private String description;
    private String cover_image;

    // Constructor
    public Game(int game_id, String title, String genre, LocalDate release_date, String description, String cover_image) {
        this.game_id = game_id;
        this.title = title;
        this.genre = genre;
        this.release_date = release_date;
        this.description = description;
        this.cover_image = cover_image;
    }

    // Getter và Setter
    public int getGameId() {
        return game_id;
    }

    public void setGameId(int game_id) {
        this.game_id = game_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public LocalDate getReleaseDate() {
        return release_date;
    }

    public void setReleaseDate(LocalDate release_date) {
        this.release_date = release_date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCoverImage() {
        return cover_image;
    }

    public void setCoverImage(String cover_image) {
        this.cover_image = cover_image;
    }

    @Override
    public String toString() {
        return "Game{" +
                "game_id=" + game_id +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", release_date=" + release_date +
                ", description='" + description + '\'' +
                ", cover_image='" + cover_image + '\'' +
                '}';
    }
}
