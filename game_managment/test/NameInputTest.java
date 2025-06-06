import java.util.*;  
import java.io.*;

// Giả định các class cần thiết
class Game {
    private String tenGame;

    public Game(String tenGame) {
        this.tenGame = tenGame;
    }

    public String getTenGame() {
        return tenGame;
    }
}

class UserGame {
    private Game game;

    public UserGame(Game game) {
        this.game = game;
    }

    public Game getGame() {
        return game;
    }

    @Override
    public String toString() {
        return "UserGame: " + game.getTenGame();
    }
}

class User {
    private List<UserGame> danhSachGame = new ArrayList<>();

    public void addGame(UserGame ug) {
        danhSachGame.add(ug);
    }

    public List<UserGame> getDanhSachGame() {
        return danhSachGame;
    }
}

// Lớp cần test
class NameInput {
    public static void nameEnter(User user, Scanner sc) {
        System.out.print("Nhap ten game can tim: ");
        String tenTim = sc.nextLine().toLowerCase();
        boolean timThay = false;

        for (UserGame ug : user.getDanhSachGame()) {
            if (ug.getGame().getTenGame().toLowerCase().contains(tenTim)) {
                System.out.println(ug);
                timThay = true;
            }
        }

        if (!timThay) {
            System.out.println("Khong tim thay game.");
        }
    }
}

// Test
public class NameInputTest {
    public static void main(String[] args) {
        // Tạo dữ liệu mẫu
        User user = new User();
        user.addGame(new UserGame(new Game("Minecraft")));
        user.addGame(new UserGame(new Game("Valorant")));
        user.addGame(new UserGame(new Game("League of Legends")));

        // Mô phỏng đầu vào người dùng
        String simulatedInput = "craft\n"; // Người dùng gõ "craft"
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));
        Scanner sc = new Scanner(System.in);

        // Chạy phương thức cần test
        NameInput.nameEnter(user, sc);
    }
}
