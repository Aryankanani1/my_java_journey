package MultiThreding.ThreadCongestion;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class ConsumerRunnable implements Runnable{

private BlockingQueue<String> blockingQueue = null;
private AtomicBoolean keepRunning = new AtomicBoolean(true);

    public ConsumerRunnable(BlockingQueue<String> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }


    public void stop() {
        System.out.println("stopped thread");
        this.keepRunning.set(false);
    }

    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName() + "consumer started. ");

        long objConsumed = 0;
        // until the Atomic boolean true this method runs
        while(this.keepRunning.get()){
            String obj = takeObjectFromQueue();
            if(obj!= null){
                objConsumed++;
            }
        }
        // after flipping the Atomicboolean value to false
        System.out.println(Thread.currentThread().getName() + "finishing up");
        while(this.blockingQueue.size() > 0){
            String obj = takeObjectFromQueue();
            if(obj != null){
                objConsumed++;
            }
        }
        System.out.println(Thread.currentThread().getName() + "consumer finished " +objConsumed);
    }
    // we block the consumer thread to wait for available in the blocking thread
    private String takeObjectFromQueue(){
        try {
            return blockingQueue.poll(1000, TimeUnit.MILLISECONDS);
        }catch (InterruptedException e){
            return null;
        }
    }
}
