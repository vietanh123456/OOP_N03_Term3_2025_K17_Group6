public class UserGame {
    private User user;
    private Game game;
    private String trangThai;

    public UserGame(User user, Game game, String trangThai) {
        this.user = user;
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
        return game.toString() + " | Trang thai: " + trangThai;
    }
}
