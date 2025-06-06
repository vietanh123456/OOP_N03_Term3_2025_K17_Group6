import java.util.ArrayList;
import java.util.List;

public class User {
    private List<UserGame> danhSachGame = new ArrayList<>();

    public void addGame(UserGame userGame) {
        danhSachGame.add(userGame);
    }

    public List<UserGame> getDanhSachGame() {
        return danhSachGame;
    }
}
