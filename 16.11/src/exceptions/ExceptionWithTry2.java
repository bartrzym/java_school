package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;

public class ExceptionWithTry2 {
    public static void main(String[] args) {
        try (MyAutoClosable myAutoClosable = new MyAutoClosable()) {
            System.out.println("Jestem w try");
        }
    }
}

class MyAutoClosable implements AutoCloseable {


    public MyAutoClosable() {
        System.out.println("Konstruktor");
    }

    @Override
    public void close() {
        System.out.println("Cos");

    }
}

