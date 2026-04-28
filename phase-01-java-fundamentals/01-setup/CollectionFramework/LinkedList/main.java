package CollectionFramework.LinkedList;


import java.util.Collections;
import java.util.LinkedList;

class Node {

    public int value;
    public Node next;

}

public class main {
    public static void main(String[] args) throws NullPointerException {

//        Node node1 = new Node();
//        Node node2 = new Node();
//        node1.value = 1;
//        node1.next = node2;
//        node2.value = 2;
//        System.out.println(node1.value + "," + node1.next.getClass().getName());
//
//        try {
//            node2.next = null;
//            System.out.println(node2.value + "," + node2.next.getClass().getName());
//        }catch (NullPointerException e){
//            throw  new RuntimeException("it is just example of linked list");
//        }

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println(linkedList);
        linkedList.addFirst(0);
        System.out.println(linkedList);
        linkedList.addLast(12);
        System.out.println(linkedList);
        linkedList.removeIf(x -> x% 2 ==0);
        System.out.println(linkedList);


    }
}

