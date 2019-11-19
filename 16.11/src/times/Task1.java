package times;

import java.time.*;
import java.util.Calendar;
import java.util.Date;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(Instant.now());
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(OffsetDateTime.now());
        System.out.println(ZonedDateTime.now());
    }
}
