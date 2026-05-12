package JAVA8.Stream;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SelfImplementationDemo {
    public static void main(String[] args) {
        Stream <Integer> stream = Stream.iterate(0, n -> n+1).limit(100);
        System.out.println(stream.filter(x -> x % 2 == 0).map(x -> x/2).collect(Collectors.toList()));

    }
}




