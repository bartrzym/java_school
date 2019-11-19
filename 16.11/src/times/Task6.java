package times;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Task6 {

    public static final int ODSTEP = 24 * 60 / 5;

    public static void main(String[] args) {

        LocalDateTime data = LocalDateTime.of(2019, Month.NOVEMBER,16,13,0);
        for (int i =0; i<50;i++){
            System.out.println(data.plusMinutes(ODSTEP*i));
        }

    }
}
