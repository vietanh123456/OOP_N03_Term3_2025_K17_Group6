import java.util.Scanner;

public class GenreFilter {

public static void filterByGenre(User user, Scanner sc) {
System.out.print("Nhap the loai can loc: ");
String theLoaiLoc = sc.nextLine().toLowerCase();
boolean coKetQua = false;

for (UserGame ug : user.getDanhSachGame()) {
if (ug.getGame().getTheLoai().toLowerCase().contains(theLoaiLoc)) {
System.out.println(ug);
coKetQua = true;
}
}

if (!coKetQua) {
System.out.println("Khong co game thuoc the loai nay.");
}
}
}