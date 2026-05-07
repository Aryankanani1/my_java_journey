package CollectionFramework.Queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(4);
        queue.offer(3);
        System.out.println(queue);

        System.out.println( queue.peek());

       PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(10);
        priorityQueue.offer(2);
        priorityQueue.offer(3);
        priorityQueue.offer(4);
        priorityQueue.offer(5);
        System.out.println(priorityQueue);

//            while(!priorityQueue.isEmpty()){
//                System.out.println(priorityQueue.poll());
//            }
//
        System.out.println(priorityQueue.remove(2));
        System.out.println(priorityQueue);

        System.out.println(priorityQueue.poll());
    }
}
