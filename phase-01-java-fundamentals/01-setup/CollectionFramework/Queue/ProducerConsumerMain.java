package CollectionFramework.Queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerMain {
    public static void main(String[] args) {
        BlockingQueue<String> bq = new LinkedBlockingQueue<>();

        Producer p = new Producer(bq);
        Consumer c = new Consumer(bq);


        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);

        t1.start();
        t2.start();

    }
}