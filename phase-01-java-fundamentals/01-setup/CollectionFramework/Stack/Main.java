package CollectionFramework.Stack;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {

        Stack <Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());

        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        List<String> shoppinglist = copyOnWriteArrayList;
        shoppinglist.add("butter");
        shoppinglist.add("milk");
        shoppinglist.add("honey");
        for(String s : shoppinglist){
            if (s.equals("butter")){
                shoppinglist.add("bread");
                System.out.println("added bread");
            }
        }
        System.out.println("Shopping list: "+ shoppinglist);
    }
}
