package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        Class c1 = ExceptionDemo3.class;

        try {
//            Class c2 = Class.forName("ExceptionDemo3");//Zła nazwa klasy
            Class c2 = Class.forName("exceptions.ExceptionDemo3");

            System.out.println("Dzień dobry");
            FileReader fileReader = new FileReader("C:\\Program Files\\Java\\jdk1.8.0_211\\bin\\java.exe");
            System.out.println("Do widzenia");
        }catch (FileNotFoundException e){
            System.out.println("Wystąpił bład w dostępie do pliku");
        } catch (ClassNotFoundException e) {
            System.out.println("Wystąpił bład w nazwie Klasy");
        }
    }
}
