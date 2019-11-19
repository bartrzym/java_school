package times;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<LocalDate> list = new ArrayList<>();
     for(int month=1; month<=12; month++){
         list.add(LocalDate.of(2019, month, 18).plusDays(25));
     }
        System.out.println(list);

    }
}
