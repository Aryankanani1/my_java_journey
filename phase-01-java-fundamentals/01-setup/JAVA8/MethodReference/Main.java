package JAVA8.MethodReference;

import oops.Abstraction.Test;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void print(String s){
        System.out.println("string is "+s);
    }
    public static void main(String[] args) {
        List<String> list = (Arrays.asList("Aryan","kanani","robert"));
//
//        list.forEach(x -> System.out.println(x));
          list.forEach(Main::print);

          //by creating the object

        Main main = new Main();
        list.forEach(main::mail);

    }

    public void mail(String s){
        System.out.println("email is not valid: " +s+"@test.com");
    }
}
