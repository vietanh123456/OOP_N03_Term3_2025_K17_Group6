import java.util.ArrayList;
import java.util.Scanner;

public class TestNameInput {
    public static void main(String[] args) {
        // Tạo danh sách tất cả game
        ArrayList<Game> allGames = new ArrayList<>();
        allGames.add(new Game(1, "Elden Ring", "RPG", "PC"));
        allGames.add(new Game(2, "God of War", "Action", "PS5"));
        allGames.add(new Game(3, "Minecraft", "Sandbox", "PC"));
        allGames.add(new Game(4, "Hades", "Roguelike", "Switch"));

        // Tạo user và thêm game vào danh sách của user
        User user = new User();  // Giả sử bạn có constructor không tham số
        user.addGame(new UserGame(user, allGames.get(0), "dang choi"));
        user.addGame(new UserGame(user, allGames.get(1), "Chua choi"));

        // Khởi tạo Scanner
        Scanner sc = new Scanner(System.in);

        // Gọi hàm tìm kiếm
        NameInput.nameEnter(user, sc);
    }
}
