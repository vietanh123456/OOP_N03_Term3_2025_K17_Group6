import java.util.Scanner;
import java.util.List;
import java.util.InputMismatchException;

public class AddGame {

    public static void addGame(User user, List<Game> allGames) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Danh sách game có sẵn:");
            for (Game g : allGames) {
                System.out.println(g);
            }

            System.out.print("Nhập ID game muốn thêm: ");
            int idThem = sc.nextInt();
            sc.nextLine();

            Game gameToAdd = null;
            for (Game g : allGames) {
                if (g.getId() == idThem) {
                    gameToAdd = g;
                    break;
                }
            }

            if (gameToAdd == null) {
                System.out.println("ID không tồn tại.");
            } else {
                boolean daThem = false;
                for (UserGame ug : user.getDanhSachGame()) {
                    if (ug.getGame().getId() == idThem) {
                        daThem = true;
                        break;
                    }
                }

                if (daThem) {
                    System.out.println("Game đã có trong danh sách.");
                } else {
                    System.out.print("Nhập trạng thái game (Đã chơi / Đang chơi / Chưa chơi): ");
                    String trangThai = sc.nextLine();
                    user.addGame(new UserGame(user, gameToAdd, trangThai));
                    System.out.println("Đã thêm game vào danh sách.");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Lỗi: Vui lòng nhập một số nguyên hợp lệ cho ID game.");
            sc.nextLine();
        } catch (Exception e) {
            System.out.println("Đã xảy ra lỗi: " + e.getMessage());
        }
    }
}
