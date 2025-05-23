import java.util.ArrayList;

public class GameList {

    ArrayList<Game> games = new ArrayList<>();

    // Thêm game mới
    public ArrayList<Game> addGame(Game game) {
        games.add(game);
        return games;
    }

   
    public ArrayList<Game> deleteGame(String title, String platform) {
        for (int i = 0; i < games.size(); i++) {
            Game g = games.get(i);
            if (g.title.equalsIgnoreCase(title) && g.platform.equalsIgnoreCase(platform)) {
                games.remove(i);
                System.out.println("Game đã bị xóa.");
                break; // thoát vòng lặp sau khi xóa
            }
        }
        return games;
    }

    
    public void printGameList() {
        System.out.println("Danh sách game:");
        for (Game g : games) {
            System.out.println("Tên: " + g.title + ", Nền tảng: " + g.platform + ", Thể loại: " + g.genre + ", Trạng thái: " + g.status);
        }
    }
}
