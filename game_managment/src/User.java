import java.util.ArrayList;

public class User {
    private ArrayList<UserGame> danhSachGame;

    public User() {
        this.danhSachGame = new ArrayList<>();
    }

    public void addGame(UserGame userGame) {
        danhSachGame.add(userGame);
    }

    public ArrayList<UserGame> getDanhSachGame() {
        return danhSachGame;
    }
}
