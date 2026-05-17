package MultiThreding.Locks;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        ReadWriteExample readWriteExample = new ReadWriteExample();

        Runnable readTask = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " Read operation " + readWriteExample.read());
                }
            }
        };

        Runnable writeTask = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    readWriteExample.write();
                    System.out.println(Thread.currentThread().getName() + " write operation ");
                }
            }
        };

        Thread t1 = new Thread(writeTask);
        Thread t2 = new Thread(readTask);
        Thread t3 = new Thread(readTask);

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();
    }
}
