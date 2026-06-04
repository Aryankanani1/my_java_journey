package CollectionFramework.Queue.ProducerAndConsumer;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        BlockingQueue<String> bq = new LinkedBlockingQueue<>();

        Producer p1 = new Producer(bq);
        Consumer c1 = new Consumer(bq);
        Consumer c2 = new Consumer(bq);

        Thread producerThread1 = new Thread(p1);
        Thread consumerThread1 = new Thread(c1);
        Thread consumerThread2 = new Thread(c2);

        producerThread1.start();
        consumerThread1.start();
        consumerThread2.start();
    }
}
