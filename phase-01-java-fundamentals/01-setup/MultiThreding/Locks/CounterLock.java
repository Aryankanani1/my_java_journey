package MultiThreding.Locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CounterLock {

    private Lock lock = new ReentrantLock();
    private int count = 0;

    public void increament(){
        try{
            lock.lock();
            this.count++;
        }finally {
           lock.unlock();
        }
    }

    public int getCount(){
     try{
         lock.lock();
         return this.count;
     }
     finally {
         lock.unlock();
     }
    }

}
