import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DeleteGame {

    public static void deleteGame(User user) {
        Scanner sc = new Scanner(System.in);

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
        } catch (InputMismatchException e) {
            System.out.println("Lỗi: Vui lòng nhập số nguyên hợp lệ cho ID game.");
            sc.nextLine();
        } catch (Exception e) {
            System.out.println("Đã xảy ra lỗi: " + e.getMessage());
        }
    }
}
