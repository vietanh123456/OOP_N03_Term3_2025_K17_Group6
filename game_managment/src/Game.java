public class Game {
    private int id;
    private String name;
    private String genre;
    private String platform;

    public Game(int id, String name, String genre, String platform) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.platform = platform;
    }

    // Getters & Setters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getGenre() { return genre; }
    public String getPlatform() { return platform; }

    public void setName(String name) { this.name = name; }
    public void setGenre(String genre) { this.genre = genre; }
    public void setPlatform(String platform) { this.platform = platform; }

    @Override
    public String toString() {
        return "[" + id + "] " + name + " - " + genre + " - " + platform;
    }
}
