import java.util.ArrayList;
import java.util.List;

public class User {
    private int id;
    private String username;
    private List<UserGame> userGames;

    public User(int id, String username) {
        this.id = id;
        this.username = username;
        this.userGames = new ArrayList<>();
    }

    public int getId() { return id; }
    public String getUsername() { return username; }
    public List<UserGame> getUserGames() { return userGames; }

    public void addGame(UserGame userGame) {
        userGames.add(userGame);
    }

    @Override
    public String toString() {
        return "User: " + username + " (" + id + ")";
    }
}
