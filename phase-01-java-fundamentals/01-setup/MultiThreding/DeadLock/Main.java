package MultiThreding.DeadLock;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        Lock lock1 = new ReentrantLock();
        Lock lock2 = new ReentrantLock();

        Runnable1 runnable1 = new Runnable1(lock1,lock2);
        Runnable2 runnable2 = new Runnable2(lock1,lock2);

        Thread t1 = new Thread(runnable1);
        Thread t2 = new Thread(runnable2);

       t1.start();
       t2.start();
        DeadLockSynchro1 deadLockSynchro1 = new DeadLockSynchro1(lock1,lock2);
        DeadLockSynchro2 deadLockSynchro2 = new DeadLockSynchro2(lock1,lock2);

        Thread synt1 = new Thread(deadLockSynchro1);
        Thread synt2 = new Thread(deadLockSynchro2);
//        synt1.start();
//        synt2.start();

    }
}
