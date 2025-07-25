import java.util.Scanner;

public class UpdateGame {

    public void updateGame(User user, Scanner sc) {
        try {
            System.out.print("Nhập ID game cần cập nhật: ");
            int idCapNhat = sc.nextInt();
            sc.nextLine();

            boolean daCapNhat = false;

            for (UserGame ug : user.getDanhSachGame()) {
                if (ug.getGame().getId() == idCapNhat) {
                    System.out.print("Nhập trạng thái mới: ");
                    String trangThaiMoi = sc.nextLine();
                    ug.setTrangThai(trangThaiMoi);
                    System.out.println("Đã cập nhật trạng thái mới.");
                    daCapNhat = true;
                    break;
                }
            }

            if (!daCapNhat) {
                System.out.println("Không tìm thấy game cần cập nhật.");
            }
        } catch (Exception e) {
            System.out.println("Đã xảy ra lỗi: " + e.getMessage());
        }
    }
}
