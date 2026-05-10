package JAVA8.Consumer;

import java.util.function.BiConsumer;

public class BiConsumerDemo {
    public static void main(String[] args) {

        BiConsumer<String,Integer> biConsumer = (x,y) -> {
            System.out.println("concat " + x+y);
        };

        biConsumer.accept("Aryan",3);
    }
}
