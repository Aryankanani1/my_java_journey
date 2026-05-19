package MultiThreding.JAVA_MEMORY_MODEL;


public class SeparateObject {
    public static void main(String[] args) {
         MyObject myObject = new MyObject();
         //separate object
        Runnable runnable1 = new MyRunnable(myObject);
        Runnable runnable2 = new MyRunnable(myObject);

        Thread t1 = new Thread(runnable1 , "thread 1");
        Thread t2 = new Thread(runnable2,"thread 2");

        t1.start();
        t2.start();
    }
}
