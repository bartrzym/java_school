package times;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class task11 {



    public static void main(String[] args) {

        System.out.println(ZonedDateTime.now(ZoneId.of("Europe/London")));
        System.out.println(ZonedDateTime.now(ZoneId.of("Asia/Tokyo")));


    }
}
