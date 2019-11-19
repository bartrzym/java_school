package times;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Task7 {



    public static void main(String[] args) {

        LocalDate data = LocalDate.of(2019, Month.NOVEMBER,12);
        for (int i=0 ; i<5; i++) {
            data = data.plus(Period.ofDays(29));
            System.out.println(data);
        }

    }
}
