package MultiThreding.Race_Condition;

public class TwoCounterExample {

    private static Runnable getRunnable(Counter counter1, Counter counter2, String message){
        return () -> {
        for(int i=0;i<1_00_000;i++){
            counter1.increment();
        }
            System.out.println(message + " : " + counter1.get());
            System.out.println(message + " : " + counter2.get());
        };
    }

    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
//
        Thread t1 = new Thread(getRunnable(counter1,counter2,"Thread 1"));
        Thread t2 = new Thread(getRunnable(counter2,counter1,"Thread 2"));
        t1.start();
        t2.start();

    }
}
