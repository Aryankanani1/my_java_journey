package MultiThreding;

import java.util.concurrent.ThreadLocalRandom;

class ShreadResources{
    private int data;
    boolean hashData;

    public synchronized void producer(int data){
        while (hashData){
            try {
                wait();
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
       this.data = data;
        hashData = true;
        System.out.println("Produced: "+ data);
        notify();
    }

    public synchronized int consumer(){
        while(!hashData){
            try {
                wait();
            }
            catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        hashData = false;
        System.out.println("Consumed: "+ data);
        notify();
        return data;
    }
}

class Producer implements Runnable {
    private ShreadResources shreadResources;
    public Producer (ShreadResources shreadResources){
        this.shreadResources = shreadResources;
    }

    @Override
    public void run() {
        for(int i = 0;i<10;i++){
            shreadResources.producer(i);
        }
    }
}

class Consumer implements Runnable{

    private ShreadResources shreadResources;
    public Consumer(ShreadResources shreadResources){
        this.shreadResources = shreadResources;
    }
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            int value = shreadResources.consumer();

        }
    }
}
public class ThreadCommunicationDemo {
    public static void main(String[] args) {
        ShreadResources shreadResources = new ShreadResources();
        Thread producerThread = new Thread(new Producer(shreadResources));
        Thread consumerThread = new Thread(new Consumer(shreadResources));


        producerThread.start();
        consumerThread.start();

    }
}
