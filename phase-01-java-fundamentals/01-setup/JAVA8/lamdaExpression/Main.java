package JAVA8.lamdaExpression;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@FunctionalInterface
interface Myinterface{

    // only one abstract method
    public void sayHello();

    default void sayBuy() {
        System.out.println("i am going to bad");
    };

    private static void goal(){
        System.out.println("angra messi messi messi messi messi messi messi messi messi");
    };
}

public class Main {

    private void add(int a, int b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

       list.sort((a,b)->b -a);
       for(Integer i : list){
           System.out.println(i);
       }

        Set<Integer> s1 = new TreeSet<>((a, b) -> (b - a));
        s1.add(1);
        s1.add(2);
        s1.add(3);
        s1.add(5);
        s1.add(4);
        System.out.println(s1);

        // Arraylist preserved the insertion order
        List <Integer> i = new ArrayList<>();
        i.add(1);
        i.add(3);
        i.add(2);
        System.out.println("ArrayList"+i);

        // linedList preserved the insertion order
        List <Integer> l = new LinkedList<>();
        l.add(1);
        l.add(3);
        l.add(2);
//        l.sort((a,b)-> b - a);
        System.out.println("LinkedList"+l);

        //vector preserved the sorting order
        Vector<Integer> v = new Vector<>();
        v.add(1);
        v.add(3);
        v.add(2);
        v.sort((a,b)-> b - a);
        System.out.println("vector"+v);

        //set
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(2);
        System.out.println("hashset"+set);

        //linkedHashSet
        //linkedHashSet preserved the insertion order
        LinkedHashSet<Integer> lh = new LinkedHashSet<>();
        lh.add(1);
        lh.add(3);
        lh.add(2);
        System.out.println("linkedHashSet"+lh);
//        List<Integer> list1 = lh.stream().sorted((a,b)-> b-a ).collect(Collectors.toList());
//        System.out.println(list1);

        // tree map
        // treeset preserved sorting order
        Set <Integer> trset = new TreeSet<>();
        trset.add(1);
        trset.add(3);
        trset.add(2);
        System.out.println(trset);











    }
}
