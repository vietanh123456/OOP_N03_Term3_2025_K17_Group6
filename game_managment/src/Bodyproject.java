import java.util.Scanner;

public class Bodyproject {

    public void run() {
        User user = new User();

        Scanner sc = new Scanner(System.in);
        int choice;

        // Tạo các đối tượng để dùng
        NameInput nameInput = new NameInput();
        GenreFilter genreFilter = new GenreFilter();
        AddGame addGame = new AddGame();
        DeleteGame deleteGame = new DeleteGame();
        UpdateGame updateGame = new UpdateGame();
        ListGame listGame = new ListGame();

        do {
            System.out.println("\n===== QUAN LY GAME =====");
            System.out.println("1. Xem danh sach game cua ban");
            System.out.println("2. Tim kiem game");
            System.out.println("3. Loc game theo the loai");
            System.out.println("4. Them game moi vao danh sach cua ban");
            System.out.println("5. Xoa game");
            System.out.println("6. Cap nhat trang thai game");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    listGame.listGame(user);
                    break;

                case 2:
                    nameInput.nameEnter(user, sc);
                    break;

                case 3:
                    genreFilter.filterByGenre(user, sc);
                    break;

                case 4:
                    addGame.addGame(user, sc);
                    break;

                case 5:
                    deleteGame.deleteGame(user, sc);
                    break;

                case 6:
                    updateGame.updateGame(user, sc);
                    break;

                case 0:
                    System.out.println("Thoat chuong trinh.");
                    break;

                default:
                    System.out.println("Lua chon khong hop le.");
            }
        } while (choice != 0);

        sc.close();
    }
}
