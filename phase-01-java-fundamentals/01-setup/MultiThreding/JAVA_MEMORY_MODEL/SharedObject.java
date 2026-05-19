package MultiThreding.JAVA_MEMORY_MODEL;

public class SharedObject {
    public static void main(String[] args) {

        MyObject object = new MyObject();
        MyRunnable runnable = new MyRunnable(object);
        // shared object
        Thread t1 = new Thread(runnable,"thread 1");
        Thread t2 = new Thread(runnable, "thread 2");
        t1.start();
        t2.start();
    }
}

