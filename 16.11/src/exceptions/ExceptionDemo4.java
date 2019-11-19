package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo4 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c1 = ExceptionDemo4.class;

        try {
            Class c2 = Class.forName("ExceptionDemo3");//Zła nazwa klasy
//            Class c2 = Class.forName("exceptions.ExceptionDemo4");

            System.out.println("Dzień dobry");
            FileReader fileReader = new FileReader("C:\\Program Files\\Java\\jdk1.8.0_211\\bin\\java.exe");
            System.out.println("Do widzenia");
        } catch (FileNotFoundException e) {
            System.out.println("Wystąpił bład w dostępie do pliku");
//        } catch (ClassNotFoundException e) {
//            System.out.println("Wystąpił bład w nazwie Klasy");
        } finally {
            System.out.println("Końcowe do widzenia");
        }
    }
}
