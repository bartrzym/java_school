package times;

import java.util.Calendar;
import java.util.Date;

public class OldJavaDateExample {
    public static void main(String[] args) {
        Date date = new Date(119, 11-1, 16);
        System.out.println(date);

        Calendar calendar = Calendar.getInstance();
        calendar.set(2019,10,16);
//        calendar.add(Calendar.MONTH);
        System.out.println(calendar.getTime());
    }
}
