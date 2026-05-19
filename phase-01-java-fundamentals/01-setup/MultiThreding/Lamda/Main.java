package MultiThreding.Lamda;

public class Main {
    public static void main(String[] args) {
        Runnable runnable = () ->
            System.out.println(Thread.currentThread().getName() + " is running");

        Thread t1 = new Thread(runnable, "t1");
        t1.start();
        try {
            t1.sleep(3000);
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
        Thread t2 = new Thread(() -> System.out.println("method finished"));
        t2.start();
    }
}
