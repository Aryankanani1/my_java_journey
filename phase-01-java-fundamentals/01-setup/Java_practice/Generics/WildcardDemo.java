package Generics;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildcardDemo {
    public static void main(String[] args) {
        System.out.println(sum(Arrays.asList(1,2.2,3,3.14)));

    }

    // upper bound
    public static double sum(List< ? extends Number > numbers){
        double sum = 0;
        for(Number o: numbers){
            sum += o.doubleValue();
        }
       return sum;
    }


     // lower bound
    public static void printNumber(List< ? super Integer >list){
        for(Object o: list){
            System.out.println(o);
        }

    }

    // if we have to return something we don't have to mentioned <T> use can use the wildcard
    public <T> void addNumber(ArrayList<T> list){
        for(T t : list){
            System.out.println(t);
        }
    }

   //wild card example

    public void addNumbers(ArrayList<?> list){
        for(Object o: list){
            System.out.println(list);
        }

    }
}

