import java.util.Scanner;

public class AddGame {

    public void addGame(User user, Scanner sc) {

        try {
            System.out.print("Nhap ID game moi: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Nhap ten game moi: ");
            String tenGame = sc.nextLine();

            System.out.print("Nhap the loai: ");
            String theLoai = sc.nextLine();

            System.out.print("Nhap nen tang: ");
            String nenTang = sc.nextLine();

            System.out.print("Nhap trang thai game (Da choi / Dang choi / Chua choi): ");
            String trangThai = sc.nextLine();

            // Tao Game va UserGame
            Game newGame = new Game(id, tenGame, theLoai, nenTang);
            UserGame newUserGame = new UserGame(user, newGame, trangThai);

            // Kiem tra trung ID
            boolean daThem = false;
            for (UserGame ug : user.getDanhSachGame()) {
                if (ug.getGame().getId() == id) {
                    daThem = true;
                    break;
                }
            }

            if (daThem) {
                System.out.println("Game da co trong danh sach cua ban.");
            } else {
                user.addGame(newUserGame);
                System.out.println("Da them game moi vao danh sach cua ban.");
            }

        } catch (Exception e) {
            System.out.println("Da xay ra loi: " + e.getMessage());
            sc.nextLine(); // Clear buffer
        }
    }
}
