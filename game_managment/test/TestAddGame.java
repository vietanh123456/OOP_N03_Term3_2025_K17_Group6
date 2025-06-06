import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestAddGame {
    public static void main(String[] args) {
        // Tạo danh sách game mẫu
        List<Game> allGames = new ArrayList<>();
        allGames.add(new Game(1, "Elden Ring", "RPG", "PC"));
        allGames.add(new Game(2, "God of War", "Action", "PS5"));
        allGames.add(new Game(3, "Minecraft", "Sandbox", "PC"));

        // Tạo người dùng giả lập
        User user = new User();

        // Gọi thử phương thức thêm game
        Scanner sc = new Scanner(System.in);
        AddGame.addGame(user, allGames);

        // In ra danh sách game sau khi thêm để kiểm tra
        System.out.println("\nDanh sách game của người dùng sau khi thêm:");
        for (UserGame ug : user.getDanhSachGame()) {
            System.out.println(ug);
        }

        sc.close();
    }
}
