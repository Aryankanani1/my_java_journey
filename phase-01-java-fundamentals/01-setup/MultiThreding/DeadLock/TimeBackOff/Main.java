package MultiThreding.DeadLock.TimeBackOff;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
Lock lock1 = new ReentrantLock();
Lock lock2 = new ReentrantLock();

RunnableTimeOut1 timeOut1 = new RunnableTimeOut1(lock1,lock2);
RunnableTimeOut2 timeOut2 = new RunnableTimeOut2(lock1,lock2);

Thread t1 = new Thread(timeOut1);
Thread t2 = new Thread(timeOut2);
t1.start();
t2.start();


    }
}
