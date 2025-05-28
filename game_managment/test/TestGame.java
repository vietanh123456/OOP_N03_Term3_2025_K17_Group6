import java.time.LocalDate;

public class GameTest {
    public static void main(String[] args) {
        Game game = new Game(
            1,
            "The Witcher 3: Wild Hunt",
            "RPG",
            LocalDate.of(2015, 5, 19),
            "An epic RPG set in a dark fantasy world.",
            "images/witcher3.jpg"
        );

        System.out.println("Thong tin game:");
        System.out.println("ID: " + game.getGameId());
        System.out.println("Ten: " + game.getTitle());
        System.out.println("The loai: " + game.getGenre());
        System.out.println("Ngay phat hanh: " + game.getReleaseDate());
        System.out.println("Mo ta: " + game.getDescription());
        System.out.println("Anh bia: " + game.getCoverImage());

        System.out.println("\nThong tin day du qua toString():");
        System.out.println(game);
    }
}
