package CollectionFramework.Queue.ProducerAndConsumer;

import java.util.concurrent.BlockingQueue;

class Consumer implements Runnable{

    private BlockingQueue<String> bq = null;

    Consumer(BlockingQueue<String> bq){
        this.bq = bq;
    }

    @Override
    public void run() {
        while(true){
            try{
                String element = this.bq.take();
               String text = Thread.currentThread().getName() + " consumed: " + element;
                System.out.println(text);
            }catch (Exception e){
                System.out.println("consumer was interrupted");
            }
        }
    }
}
