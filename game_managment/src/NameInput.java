import java.util.Scanner;

public class NameInput {

    public static void nameEnter(User user, Scanner sc) {
        System.out.print("Nhap ten game can tim: ");
        String tenTim = sc.nextLine().toLowerCase();
        boolean timThay = false;

        for (UserGame ug : user.getDanhSachGame()) {
            if (ug.getGame().getTenGame().toLowerCase().contains(tenTim)) {
                System.out.println(ug);
                timThay = true;
            }
        }

        if (!timThay) {
            System.out.println("Khong tim thay game.");
        }
    }
}

