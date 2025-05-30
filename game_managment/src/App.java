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
                    System.out.print("nhap the loai can loc: ");
                    String theLoaiLoc = sc.nextLine().toLowerCase();
                    boolean coKetQua = false;
                    for (UserGame ug : user.getDanhSachGame()) {
                        if (ug.getGame().getTheLoai().toLowerCase().contains(theLoaiLoc)) {
                            System.out.println(ug);
                            coKetQua = true;
                        }
                    }
                    if (!coKetQua) System.out.println("khong co game thuoc the loai nay.");
                    break;

                case 4: // Thêm game
                    AddGame.addGame(user, allGames);
                    break;

                case 5: // Xóa game
                    System.out.print("Nhap ID game muon xoa: ");
                    int idXoa = sc.nextInt();
                    sc.nextLine();
                    boolean daXoa = false;
                    ArrayList<UserGame> danhSach = user.getDanhSachGame();
                    for (int i = 0; i < danhSach.size(); i++) {
                        if (danhSach.get(i).getGame().getId() == idXoa) {
                            danhSach.remove(i);
                            daXoa = true;
                            System.out.println("da xoa game.");
                            break;
                        }
                    }
                    if (!daXoa) System.out.println("khong tim thay game.");
                    break;

                case 6: // Cập nhật trạng thái
                    System.out.print("Nhap ID game can cap nhat: ");
                    int idCapNhat = sc.nextInt();
                    sc.nextLine();
                    boolean daCapNhat = false;
                    for (UserGame ug : user.getDanhSachGame()) {
                        if (ug.getGame().getId() == idCapNhat) {
                            System.out.print("nhap trang thai moi: ");
                            String trangThaiMoi = sc.nextLine();
                            ug.setTrangThai(trangThaiMoi);
                            System.out.println("da cap nhat trang thai moi.");
                            daCapNhat = true;
                            break;
                        }
                    }
                    if (!daCapNhat) System.out.println("khong tim thay game can cap nhat.");
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
