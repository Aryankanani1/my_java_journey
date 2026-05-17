package MultiThreding.Synchronization;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Counter {
    private int count = 0;

//   public Counter(int count){
//        this.count = count;
//   }

   public  void increment(){
       synchronized (this){
           count++;
       }
   }
   public int getCount(){
       return count;
   }

}

class BankAccount{

    private int balance = 100;

    private Lock lock = new ReentrantLock();


    public void withdraw(int amount){
        System.out.println(Thread.currentThread().getName() + "attempting withdraw ");
        try{

        if(lock.tryLock(2000, TimeUnit.MILLISECONDS)){
                if(balance >= amount){
                    System.out.println(Thread.currentThread().getName()+ "preceding withdrawal");
                    try{
                        Thread.sleep(3000);
                    }catch (InterruptedException e){
                        Thread.currentThread().interrupt();
                    }
                    finally {
                        lock.unlock();
                    }
                    balance -= amount;
                    System.out.println(Thread.currentThread().getName() + "Remaining Balance "+ balance);
                }
                else {
                    System.out.println(Thread.currentThread().getName() + "insufficient balance");
                }
        }
        else {
            System.out.println(Thread.currentThread().getName() + " could not acquired the lock try again later");
        }
    }
        catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}

class ReEntrantExample{

    private final Lock lock = new ReentrantLock();

    public void outerMethod(){

        lock.lock();
        System.out.println(Thread.currentThread().getState());
        try{
            System.out.println("outerMethod called");
           innerMethod();

        } finally {
            lock.unlock();
        }
    }

    public void innerMethod(){
        lock.lock();
        try{
            System.out.println("inner method called");
        }finally {
            lock.unlock();
        }
    }
}

public class Main {
    public static void main(String[] args){
//       Counter counter = new Counter();
//        MyThread t1 = new MyThread(counter);
//        MyThread t2 = new MyThread(counter);
//        t1.start();
//        t2.start();
//try{
//    t1.join();
//    t2.join();
//}catch (InterruptedException e){
//    System.out.println(e.fillInStackTrace());
//}
//        System.out.println(counter.getCount());

//        BankAccount bankAccount = new BankAccount();
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                    bankAccount.withdraw(50);
//            }
//
//        };
//
//        Thread t1 = new Thread(runnable,"Thread 1");
//        Thread t2 = new Thread(runnable,"Thread 2");
//        t1.start();
//        t2.start();

        ReEntrantExample reEntrantExample = new ReEntrantExample();
        reEntrantExample.outerMethod();
    }
}

