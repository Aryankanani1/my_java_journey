package CollectionFramework.Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) throws Exception {
       Queue<Integer> q = new LinkedList<>();

       q.offer(1);
       q.offer(3);
       q.offer(4);
        System.out.println(q);

        while(q.isEmpty()){
            System.out.println(q.poll());
        }

        ArrayDeque<Integer> q1 = new ArrayDeque<>();
        q1.offer(10);
        q1.offerLast(22);
        q1.addFirst(30);
        System.out.println(q1);

        Queue<Integer> pq = new PriorityQueue<>((a,b)-> b - a);
        // the priority will based on the integer
        pq.offer(1);
        pq.offer(-1);
        pq.offer(0);
        System.out.println(pq);
        System.out.println( pq.poll());
        System.out.println( pq.poll());
                //bounded queue
        BlockingQueue <Integer> bq = new LinkedBlockingQueue<>(5);
        bq.offer(3);
        bq.add(6);
        bq.add(4);
        bq.add(33);
        bq.add(1);
        try {
            bq.add(55);
        }
        catch (Exception e){
            System.out.println("queue is full");
        }
        System.out.println(bq);




    }

}
