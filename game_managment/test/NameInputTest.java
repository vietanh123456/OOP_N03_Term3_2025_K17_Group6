import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class NameInputTest {
    public static void main(String[] args) {
        // Tạo game mẫu
        Game g1 = new Game(1, "Minecraft", "Sandbox", "PC");
        Game g2 = new Game(2, "League of Legends", "MOBA", "PC");
        Game g3 = new Game(3, "Valorant", "FPS", "PC");

        // Tạo user và thêm game
        User user = new User();
        user.addGame(new UserGame(g1, "Đã chơi"));
        user.addGame(new UserGame(g2, "Chưa chơi"));
        user.addGame(new UserGame(g3, "Đang chơi"));

        // Gọi hàm NameInput để tìm
        Scanner sc = new Scanner(System.in);
        NameInput.nameEnter(user, sc);
        sc.close();
    }
}
