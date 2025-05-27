public class UserGame {
    private Game game;
    private String status; // Ví dụ: "Đang chơi", "Hoàn thành", "Chưa chơi"

    public UserGame(Game game, String status) {
        this.game = game;
        this.status = status;
    }

    public Game getGame() { return game; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    @Override
    public String toString() {
        return game.toString() + " | Trạng thái: " + status;
    }
}
