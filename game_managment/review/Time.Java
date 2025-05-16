import java.time.LocalDateTime;
import java.time.Duration;

public class Time {


    public static LocalDateTime getCurrentTime() {
        return LocalDateTime.now();
    }


    public static long getDurationInSeconds(LocalDateTime start, LocalDateTime end) {
        Duration duration = Duration.between(start, end);
        return duration.getSeconds();
    }


    public static long getDurationInMinutes(LocalDateTime start, LocalDateTime end) {
        Duration duration = Duration.between(start, end);
        return duration.toMinutes();
    }
}
