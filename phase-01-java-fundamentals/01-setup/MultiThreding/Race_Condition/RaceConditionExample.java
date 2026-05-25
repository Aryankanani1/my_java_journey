package MultiThreding.Race_Condition;

public class RaceConditionExample {


    private static Runnable getRunnable(Counter counter, String message){
        return () -> {
            for(int i = 0; i < 1_00_000 ; i++){
                counter.increment();
            }
            System.out.println(message + " = " +counter.get());
        };
    }

    private static Runnable writingThread(Counter counter, String message){
        return  () -> {
            for(int i = 0;i<1_00_000 ;i++){
                counter.increment();
            }
            System.out.println(message + " = " + counter.get());
        };
    }

    private static Runnable readingThread (Counter counter, String message) {
        return () -> {
            for(int i = 0;i<5;i++) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                System.out.println(message + " " + counter.get());
            }
        };
    }


    public static void main(String[] args) {

        Counter counter = new Counter();

//        Thread t1  = new Thread(getRunnable(counter,"total count of thread-1"));
//        Thread t2  = new Thread(getRunnable(counter,"total count of thread-2"));
//        t1.start();
//        t2.start();


        Thread thread1 = new Thread(writingThread(counter,"writing thread t1: "));
        Thread thread2 = new Thread(readingThread(counter,"reading thread t2: "));

        thread1.start();
        thread2.start();

    }
}
