package MultiThreding.ThreadSignaling;

public class ThreadSignalingExample2 {
    public static void main(String[] args) {
        SignalCarrier signalCarrier = new SignalCarrier();

        Thread waiter = new Thread(() -> {

            synchronized (signalCarrier){
                try{
                    signalCarrier.doWait();
                }catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread notifier = new Thread(() -> {
                signalCarrier.doNotify();
        });

        waiter.start();
        notifier.start();
    }
}
