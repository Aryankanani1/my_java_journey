package CollectionFramework.Vector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
//       Vector<Integer> vector = new Vector<>();
//
//        System.out.println( vector.capacity());

        //constructor of vector
        Vector<Integer> vector1 = new Vector<>(5);
        vector1.add(1);
        vector1.add(2);
        vector1.add(3);
        vector1.add(4);
        vector1.add(5);
        System.out.println(vector1.capacity());
        vector1.add(6);
        System.out.println(vector1.capacity());


        // set the capacity
        Vector<Integer> vector2 = new Vector<>(5,3);
        vector2.add(1);
        vector2.add(2);
        vector2.add(3);
        vector2.add(4);
        vector2.add(5);
        System.out.println(vector2.capacity());
        vector2.add(6);
        System.out.println(vector2.capacity());


        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        Vector<Integer> LinkedList_number = new Vector<>(numbers);
        System.out.println(LinkedList_number);
    }
}
