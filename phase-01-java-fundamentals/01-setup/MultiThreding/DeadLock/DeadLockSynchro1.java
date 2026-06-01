package MultiThreding.DeadLock;

import java.util.concurrent.locks.Lock;

class DeadLockSynchro1 implements Runnable{

    private Object lock1 = null;
    private Object lock2 = null;

        DeadLockSynchro1(Lock lock1, Lock lock2){
            this.lock1 = lock1;
            this.lock2 = lock2;
        }

        @Override
    public void run() {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + "attempting lock1");
            synchronized (lock1) {
                System.out.println(threadName + "locked lock1");


                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {

                }

                System.out.println(threadName + "attempting lock2");
                synchronized (lock2) {
                    System.out.println(threadName + "locked lock2");
                }
                System.out.println(threadName + "unlocking the lock2");
            }
            System.out.println(threadName + "unlocking the lock1");
        }
}
