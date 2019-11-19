package exceptionsTasks;

import java.util.Random;

public class Task2 {
    public static class Triangle {
        int a;
        int b;
        int c;

        public Triangle(int a, int b, int c) throws RuntimeException {
            if (!(a > b + c) || !(b < a + c) || !(c < b + a)) {
                throw new RuntimeException("To nie jest trojkat");

            }
            this.a = a;
            this.b = b;
            this.c = c;

        }

    }

    public static void main(String[] args) {
        try {
            Triangle triangle = new Triangle(15, 6, 22);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
