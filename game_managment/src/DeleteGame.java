import java.util.ArrayList;
import java.util.Scanner;

public class DeleteGame {

    public void deleteGame(User user, Scanner sc) {

        try {
            System.out.print("Nhập ID game muốn xoá: ");
            int idXoa = sc.nextInt();
            sc.nextLine();

            boolean daXoa = false;
            ArrayList<UserGame> danhSach = user.getDanhSachGame();

            for (int i = 0; i < danhSach.size(); i++) {
                if (danhSach.get(i).getGame().getId() == idXoa) {
                    danhSach.remove(i);
                    daXoa = true;
                    System.out.println("Đã xoá game.");
                    break;
                }
            }

            if (!daXoa) {
                System.out.println("Không tìm thấy game.");
            }
        
        } catch (Exception e) {
            System.out.println("Đã xảy ra lỗi: " + e.getMessage());
        }
    }
}
