import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<Game> allGames = new ArrayList<>();
        allGames.add(new Game(1, "Elden Ring", "RPG", "PC"));
        allGames.add(new Game(2, "God of War", "Action", "PS5"));
        allGames.add(new Game(3, "Minecraft", "Sandbox", "PC"));
        allGames.add(new Game(4, "Hades", "Roguelike", "Switch"));

        User user = new User();
        user.addGame(new UserGame(user, allGames.get(0), "dang choi"));
        user.addGame(new UserGame(user, allGames.get(1), "Chua choi"));

        Scanner sc = new Scanner(System.in);
        int choice;




        do {
            System.out.println("\n===== QUAN LY GAME =====");
            System.out.println("1. xem danh sach game");
            System.out.println("2. Tim kiem game");
            System.out.println("3. Loc game theo the loai");
            System.out.println("4. Them game");
            System.out.println("5. Xoa game");
            System.out.println("6. cap nhat trang thai game");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    for (UserGame ug : user.getDanhSachGame()) {
                        System.out.println(ug);
                    }
                    break;

                case 2:
                    NameInput.nameEnter(user, sc);
                    break;
                

                case 3:
                    GenreFilter.filterByGenre(user, sc);
                    break;

                case 4: // Thêm game
                    AddGame.addGame(user, allGames);
                    break;

                case 5: // Xóa game
                   DeleteGame.deleteGame(user);
                    break;

                case 6: // Cập nhật trạng thái
                    case 6: // Cập nhật trạng thái
                    UpdateGame.updateGame(user, sc);
                    break;

                case 0:
                    System.out.println("Thoat chuong trinh.");
                    break;

                default:
                    System.out.println("lua chon khong hop le.");
            }
        } while (choice != 0);

        sc.close();
    }
}
