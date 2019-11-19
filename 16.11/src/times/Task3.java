package times;

import java.time.*;

public class Task3 {
    public static void main(String[] args) {
       LocalDate DataWystawienia = LocalDate.of(2019,Month.OCTOBER,31);
       LocalDate Dataplatnosci = DataWystawienia.plusDays(21);
        System.out.println(Dataplatnosci);
    }
}
