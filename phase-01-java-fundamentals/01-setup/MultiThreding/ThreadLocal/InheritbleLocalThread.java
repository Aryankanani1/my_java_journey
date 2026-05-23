package MultiThreding.ThreadLocal;

public class InheritbleLocalThread {
    public static void main(String[] args) {

        ThreadLocal <String> threadLocal = new ThreadLocal();
        InheritableThreadLocal <String> inheritableThreadLocal = new InheritableThreadLocal<>();

        Thread t1 = new Thread(() -> {
            System.out.println(" === this is thread 1 === ");
            threadLocal.set("thread-1");
            inheritableThreadLocal.set("thread-1 inheritableThreadLocal");

            System.out.println(threadLocal.get());
            System.out.println(inheritableThreadLocal.get());

            Thread childThread = new Thread(() -> {
                System.out.println("this is child thread");
                // child thread will not able to access the thread because it is in the super class
                System.out.println(threadLocal.get());
                System.out.println(inheritableThreadLocal.get());
            });
            childThread.start();
        });
        t1.start();

        // this is different thread so we can't access the other stored value
        Thread t2 = new Thread(() -> {
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
            System.out.println("=== Thread-2 ===");
            System.out.println(threadLocal.get());
            System.out.println(inheritableThreadLocal.get());
        });
        t2.start();
    }
}
