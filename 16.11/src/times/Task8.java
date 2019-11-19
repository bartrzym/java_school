package times;

import java.time.*;
import java.util.ArrayList;
import java.util.List;



public class Task8 {
    public static final int ODSTEPKOTA = 24 * 60 / 5;
    public static final int ODSTEPPSA = 24 * 60 / 2;


    public static void main(String[] args) {

        LocalDateTime data = LocalDateTime.of(2019, Month.NOVEMBER,12,6,0);

        for (int i=0 ; i<10; i++) {
            System.out.println("Pies je o"+data.plusMinutes(ODSTEPPSA*i));
        }

            for (int i =0; i<10;i++){
                System.out.println("Kot je o " + data.plusMinutes(ODSTEPKOTA*i));
            }

        }

    }

