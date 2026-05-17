package MultiThreding.Locks;

import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class LockUnfairExample {

    private Lock unfair = new ReentrantLock(true);

   public void accessResource(){
       unfair.lock();
      try{
          System.out.println(Thread.currentThread().getName() + " acquired lock");
          Thread.sleep(1000);
      }catch (InterruptedException e){
          Thread.currentThread().interrupt();
      }
      finally {
          System.out.println(Thread.currentThread().getName() + " released the lock");
          unfair.unlock();
      }
   }
}
