package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo2 {
    public static void main(String[] args) throws FileNotFoundException {

            FileReader fileReader = new FileReader(("plik.txt"));

    }
}
