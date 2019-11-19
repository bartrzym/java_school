package times;

import java.time.*;

public class task12 {


    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2019, 12, 12);
        LocalTime time = LocalTime.of(6, 0);
         ZoneId zone = ZoneId.of("Europe/Moscow");
        LocalDateTime localDateTime = LocalDateTime.of(date,time);
        System.out.println(zone);


    }
}
