package JAVA8.Supplier;

import com.sun.tools.jconsole.JConsoleContext;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> p1 = x -> x % 2 == 0; // boolean
        Function<Integer, Integer> f1 = x -> x * x;
        Consumer<Integer> c1 = x -> System.out.println(x);
        Supplier<Integer> s1 = () -> 10;


        if (p1.test(s1.get())) {
        c1.accept(f1.apply(s1.get()));
        }
    }
}