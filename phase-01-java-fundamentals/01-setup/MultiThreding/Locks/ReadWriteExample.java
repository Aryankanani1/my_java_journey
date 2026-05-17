package MultiThreding.Locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class ReadWriteExample {
    private int count = 0;

      private final ReadWriteLock lock  =  new ReentrantReadWriteLock();
      private Lock writeLock = lock.writeLock();
      private Lock readLock = lock.readLock();

    public void write(){
        writeLock.lock();
        try{
            count++;
        }finally {
            writeLock.unlock();
        }
    }

    public int read(){
        readLock.lock();
       try{
           return count;
       }
       finally {
           readLock.unlock();
       }
    }
}

