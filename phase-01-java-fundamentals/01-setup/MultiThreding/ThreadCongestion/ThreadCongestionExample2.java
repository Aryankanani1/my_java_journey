package MultiThreding.ThreadCongestion;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ThreadCongestionExample2 {
    public static void main(String[] args) {

        int objectToProduce = 1_000_000;
        // three blocking queue and 3 consumer
        BlockingQueue<String> [] bq = new ArrayBlockingQueue[3];
for(int i = 0;i<bq.length;i++){
    bq[i] = new ArrayBlockingQueue<String>(objectToProduce);
}

        ConsumerRunnable [] cr = new ConsumerRunnable[3];
        synchronized (ThreadCongestionExample2.class){
            for(int i=0;i<cr.length;i++){
                cr[i] = new ConsumerRunnable(bq[i]);
                Thread consumingThread = new Thread(cr[i]);
                consumingThread.start();
            }
        }
        Thread producingThread = new Thread(() -> {
            for(int i=0;i<objectToProduce ;i++){
                try{
                    bq[i % bq.length].put("" +i);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }

            System.out.println("All objects Produced");
            System.out.println("  =>  " + objectToProduce);
            synchronized (ThreadCongestionExample2.class){
                for(int i= 0; i < cr.length;i++){
                    cr[i].stop();
                }
            }
        });
producingThread.start();
    }
}
