package exceptions;

import java.io.FileReader;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader(("plik.txt"));
        }catch (Exception e){
            System.out.println("Wystąpił bład");
        }
    }
}
