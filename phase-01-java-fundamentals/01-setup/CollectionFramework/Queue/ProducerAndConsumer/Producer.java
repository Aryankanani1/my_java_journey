package CollectionFramework.Queue.ProducerAndConsumer;

import java.util.concurrent.BlockingQueue;

class Producer implements Runnable {

    private BlockingQueue<String> bq = null;

    Producer(BlockingQueue<String> bq) {
        this.bq = bq;
    }

    @Override
    public void run() {
        while(true){
            long milliSecond = System.currentTimeMillis();
            try {
                this.bq.offer("" + milliSecond);
            }catch (Exception e){
                System.out.println("producer was interrupted");
            }
            sleep(1000);
        }
    }

    public void sleep(long timeMilliSecond) {
        try {
            Thread.sleep(timeMilliSecond);
        } catch (InterruptedException e) {

        }
    }
}
