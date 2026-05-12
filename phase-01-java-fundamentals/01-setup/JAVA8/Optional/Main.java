package JAVA8.Optional;

import javax.swing.text.html.Option;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional <String> optionals = getName(2);
        Optional<String> optionals1= optionals.map(x-> x.toUpperCase());
      optionals1.ifPresent(System.out::println);
    }


    public static Optional<String> getName(int id)
    {
      return Optional.of("aryan");


    }
}
