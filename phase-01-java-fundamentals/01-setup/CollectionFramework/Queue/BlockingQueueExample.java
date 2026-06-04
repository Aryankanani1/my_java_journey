package CollectionFramework.Queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueExample {
    public static void main(String[] args) throws InterruptedException {

        BlockingQueue<Integer> bq = new LinkedBlockingQueue<>();
        try{
            bq.put(1);
            bq.put(2);
            bq.put(4);
            bq.put(3);

        }catch (Exception e){
            System.out.println("error occured");
        }
        System.out.println(bq);

     Integer i = bq.take();
        System.out.println(i);
        System.out.println(bq);

    }
}



