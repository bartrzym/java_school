package times;

import java.time.*;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(Instant.ofEpochSecond((long) ((2019 - 1970) * 365.25 * 24 * 3600)));
        System.out.println(LocalDate.of(2019, Month.NOVEMBER, 16));
        System.out.println(LocalTime.of(18, 8));
        System.out.println(LocalDateTime.of(2019, Month.NOVEMBER, 16, 18, 26));
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        ZoneOffset offset = ZoneOffset.UTC;
        System.out.println(LocalDateTime.of(date, time));
        System.out.println(OffsetDateTime.of(date, time, offset));
        ZoneId zone = ZoneId.systemDefault();
        System.out.println(ZonedDateTime.of(date,time,zone));
    }
}
