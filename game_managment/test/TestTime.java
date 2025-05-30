import java.time.LocalDateTime;

public class TestTime {
    public static void main(String[] args) {
        LocalDateTime start = time.getCurrentTime();

        try {
            Thread.sleep(3000); // 3 giây
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        LocalDateTime end = Time.getCurrentTime();
        System.out.println("Duration in seconds: " + time.getDurationInSeconds(start, end));
    }
}
