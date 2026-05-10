package JAVA8.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        Consumer<String> consumer = s -> System.out.println(s);
        Consumer<List<Integer>> listConsumer = l -> {

            for(Integer i : l){
                System.out.println(i+100);
            }
        };

        Consumer<List<Integer>> listConsumer1 =  l -> {
            for(Integer i : l){
                System.out.println("listConsumer 1" +i);
            }
        };
listConsumer1.andThen(listConsumer).accept(Arrays.asList(1,2,3,4,5,6));


    }
}
