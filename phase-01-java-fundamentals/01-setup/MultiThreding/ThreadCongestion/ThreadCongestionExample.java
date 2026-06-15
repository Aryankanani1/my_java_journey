package MultiThreding.ThreadCongestion;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ThreadCongestionExample {
    public static void main(String[] args) {

        int objectToProduce = 1_000_000;

        // only one blocking queue
        BlockingQueue bq = new ArrayBlockingQueue(objectToProduce);

        // only one blocking queue and 3 consumer thread
        ConsumerRunnable[] cr = new ConsumerRunnable[3];
        synchronized (ThreadCongestionExample.class){
            for(int i =0;i<cr.length;i++){
                cr[i] = new ConsumerRunnable(bq);
                Thread consumingThread = new Thread(cr[i]);
                consumingThread.start();
            }
        }
        Thread producingThread = new Thread(() -> {
            for(int i = 0; i< objectToProduce ;i++){
                try{
                    bq.put(" " + i);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }

            System.out.println("All object produce ");
            System.out.println(" => produced " + objectToProduce);
            synchronized (ThreadCongestionExample.class){
                for(int i=0;i< cr.length ;i++){
                    cr[i].stop();
                }
            }
        });
producingThread.start();


    }
}
