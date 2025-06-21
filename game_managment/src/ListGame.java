public class ListGame {

    public void listGame(User user) {

        System.out.println("\n--- Danh sach game cua ban ---");

        if (user.getDanhSachGame().isEmpty()) {
            System.out.println("Chua co game nao.");
        } else {
            for (UserGame ug : user.getDanhSachGame()) {
                System.out.println(ug);
            }
        }
    }
}
