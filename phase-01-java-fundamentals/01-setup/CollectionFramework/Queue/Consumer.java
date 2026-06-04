package CollectionFramework.Queue;

import java.util.Collection;
import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

    private BlockingQueue<String> bq = null;

    Consumer(BlockingQueue<String> bq) {
        this.bq = bq;
    }

    @Override
    public void run() {
        while (true) {
            try {
                String element = this.bq.take();
                System.out.println("consumed" + element);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

