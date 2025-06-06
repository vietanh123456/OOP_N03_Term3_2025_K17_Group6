public class UserGame {
    private Game game;
    private String trangThai;

    public UserGame(Game game, String trangThai) {
        this.game = game;
        this.trangThai = trangThai;
    }

    public Game getGame() {
        return game;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "Game: " + game.getTenGame() + ", Trạng thái: " + trangThai;
    }
}
