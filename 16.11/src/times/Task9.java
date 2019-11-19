package times;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;


public class Task9 {
    public static void main(String[] args) {
        LocalDate releaseDate = LocalDate.of(1996,1,23);
        LocalDate exDate = LocalDate.of(2019,9,14);
        System.out.println(ChronoUnit.MONTHS.between(releaseDate, exDate));

    }
}


