package exceptionsTasks;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] tab = new int[5];
        int x = 1;
        int y;
        int z;
        Random random = new Random();

        for (int i=0; i<tab.length; i++){
            tab[i]=x+i;
        }
        for (int i=0; i <10; i ++){
            y=random.nextInt(11);
            try {
                z = tab[y];
                System.out.println(z);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("0");
            }
        }
    }
}
