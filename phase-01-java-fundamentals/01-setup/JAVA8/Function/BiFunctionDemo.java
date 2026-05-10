package JAVA8.Function;
import java.util.function.BiFunction;

public class BiFunctionDemo {
    public static void main(String[] args) {

        BiFunction <Integer,Integer, Integer> biFunction = (x, y) -> y/x;
        System.out.println(biFunction.apply(3,6));

    }
}
