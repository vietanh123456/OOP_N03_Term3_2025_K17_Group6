public class Game {
    private int id;
    private String tenGame;
    private String theLoai;
    private String nenTang;

    public Game(int id, String tenGame, String theLoai, String nenTang) {
        this.id = id;
        this.tenGame = tenGame;
        this.theLoai = theLoai;
        this.nenTang = nenTang;
    }

    public int getId() {
        return id;
    }

    public String getTenGame() {
        return tenGame;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public String getNenTang() {
        return nenTang;
    }

    @Override
    public String toString() {
        return "[" + id + "] " + tenGame + " - " + theLoai + " - " + nenTang;
    }
}
