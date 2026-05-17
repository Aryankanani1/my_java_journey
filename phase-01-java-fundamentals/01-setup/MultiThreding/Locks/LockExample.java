package MultiThreding.Locks;



public class LockExample {
    public static void main(String[] args) {
LockUnfairExample lockUnfairExample = new LockUnfairExample();

Runnable runnable = new Runnable() {
    @Override
    public void run() {
        lockUnfairExample.accessResource();
    }
};

Thread t1 = new Thread(runnable,"Thread 1");
Thread t2 = new Thread(runnable,"Thread 2");
Thread t3 = new Thread(runnable,"Thread 3");

t1.start();
t2.start();
t3.start();

    }
}
