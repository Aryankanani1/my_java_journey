package MultiThreding.Locks;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class LockExample {
    private static void lockBasics(){
        Lock lock = new ReentrantLock(false);
        Runnable runnable = () -> {
          lockSleepUnlock(lock,1000);
        };

        Thread t1  = new Thread(runnable, "Thread 1");
        Thread t2 = new Thread(runnable, "Thread 2");
        Thread t3 = new Thread(runnable, "Thread 3");

        t1.start();
        t2.start();
        t3.start();

    }
    public static void lockSleepUnlock(Lock lock , int timeMillis){
        try{
            lock.lock();
            printThreadMessage("hold the lock.");
            sleep(timeMillis);
        }
        finally {
            lock.unlock();
        }
    }

    public static void printThreadMessage(String text){
        System.out.println(Thread.currentThread().getName() + " " + text);

    }
    public static void sleep(int timeMillis){
        try {
            Thread.sleep(timeMillis);
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }

    public static void tryLock(){
        Lock lock = new ReentrantLock();
        try{
            boolean lockSuccessful = lock.tryLock();
            System.out.println("lock successful " + lockSuccessful);
        }finally {
            lock.unlock();
        }
    }
    public static void main(String[] args) {
//LockUnfairExample lockUnfairExample = new LockUnfairExample();
//
//Runnable runnable = new Runnable() {
//    @Override
//    public void run() {
//        lockUnfairExample.accessResource();
//    }
//};
//
//Thread t1 = new Thread(runnable,"Thread 1");
//Thread t2 = new Thread(runnable,"Thread 2");
//Thread t3 = new Thread(runnable,"Thread 3");
//
//t1.start();
//t2.start();
//t3.start();

//        lockBasics();
        tryLock();
    }
}


