package times;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<DayOfWeek> list = new ArrayList<>();
     for(int i=0; i<10; i++){
         list.add(LocalDate.of(2019, 12, 4).plusYears(i).getDayOfWeek());
     }
        System.out.println(list);

    }
}
