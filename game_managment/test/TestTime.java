import java.time.LocalDateTime;

public class TestTime {
    public static void main(String[] args) {
        LocalDateTime start = Time.getCurrentTime();

        try {
            Thread.sleep(3000); // 3 giây
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        LocalDateTime end = Time.getCurrentTime();
        System.out.println("Duration in seconds: " + Time.getDurationInSeconds(start, end));
    }
}
