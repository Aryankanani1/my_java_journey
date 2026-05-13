package MultiThreding;

public class MyThread extends Thread {
    @Override
    public void run(){
        System.out.println("RUNNING"+Thread.currentThread().getName());
       try {
           Thread.sleep(2000);
       }
       catch(InterruptedException e){
           System.out.println(e.fillInStackTrace());
       }
    }


    public static void main(String[] args) throws InterruptedException {

        MyThread m1 = new MyThread();
        System.out.println(m1.getState()); // NEW: initiate the thread method
        m1.start();
        System.out.println(m1.getState());// RUNNABLE: method is ready to run wait for the CPU time
        // in java there is no running state, it is ready to run or it is currently running
        Thread.sleep(200);
        System.out.println(m1.getState());
        m1.join();
        System.out.println(m1.getState());

    }
}
