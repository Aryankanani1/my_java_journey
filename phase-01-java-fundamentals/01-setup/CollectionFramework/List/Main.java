package CollectionFramework.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        System.out.println(arr);

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

        //iterate the element
        for(int x : arr){
            System.out.println(x);
        }


        List<String> list = Arrays.asList("aryan","robert","christopher");
        System.out.println(list.getClass().getName());
        list.set(1,"morooo");
        System.out.println(list);

        //creating the list from another list

        List<String> full_name = new ArrayList<>(list);
        System.out.println(full_name);

        String [] fruits = {"apples","oranges","mangoes"};
        List<String> list2 = Arrays.asList(fruits);
        System.out.println(list2.getClass().getName());



        // removing the elements
        List<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);


        // this will remove the item from the index 1
        num.remove(1);

        // we wrap the index into value itself so it will remove the element
        num.remove(Integer.valueOf(1));
        System.out.println(num);

        //converting the array into the list
        String [] arrs  = list.toArray(new String[0]);


    }
}
