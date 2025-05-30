import java.util.ArrayList;

public class User {
    private ArrayList<UserGame> danhSachGame;

    public User() {
        danhSachGame = new ArrayList<>();
    }

    public void addGame(UserGame ug) {
        danhSachGame.add(ug);
    }

    public ArrayList<UserGame> getDanhSachGame() {
        return danhSachGame;
    }
}
