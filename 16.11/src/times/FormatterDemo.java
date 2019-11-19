package times;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class FormatterDemo {



    public static void main(String[] args) {

        LocalDate data = LocalDate.of(2019, Month.NOVEMBER,9);
            System.out.println(data);
        System.out.println(data.getDayOfMonth()+"."+data.getMonth().getValue()+"."+data.getYear());
        System.out.println(data.format(DateTimeFormatter.ofPattern("dd.MM.YYYY cccc")));

        System.out.println(LocalDate.parse("2019-12-09").plusDays(25));
        System.out.println(LocalDate.parse("05.06.2018",DateTimeFormatter.ofPattern("dd.MM.yyyy")));


    }
}
