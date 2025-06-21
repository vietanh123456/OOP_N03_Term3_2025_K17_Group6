import java.util.Scanner;

public class GenreFilter {

    public void filterByGenre(User user, Scanner sc) {
        try {
            System.out.print("Nhập thể loại cần lọc: ");
            String theLoaiLoc = sc.nextLine().toLowerCase();
            boolean coKetQua = false;

            for (UserGame ug : user.getDanhSachGame()) {
                if (ug.getGame().getTheLoai().toLowerCase().contains(theLoaiLoc)) {
                    System.out.println(ug);
                    coKetQua = true;
                }
            }

            if (!coKetQua) {
                System.out.println("Không có game thuộc thể loại này.");
            }
        } catch (Exception e) {
            System.out.println("Đã xảy ra lỗi khi lọc thể loại: " + e.getMessage());
        }
    }
}
