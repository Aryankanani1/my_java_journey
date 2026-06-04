package CollectionFramework.Queue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{

    private BlockingQueue<String> bq = null;
   Producer(BlockingQueue<String> bq){
       this.bq = bq;
   }


            @Override
            public void run(){
                   while(true){
                    long timeMills = System.currentTimeMillis();
                    try{
                        this.bq.put("" + timeMills);
                    }catch (InterruptedException e){
                        System.out.println("Producer was interrupted");
                    }
                    sleep(1000);
               }
           }


   public void sleep (long timeMills){
       try{
           Thread.sleep(timeMills);
       } catch (InterruptedException ex) {
           throw new RuntimeException(ex);
       }
   }



}
