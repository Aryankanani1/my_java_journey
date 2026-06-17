package MultiThreding.ThreadSignaling;

public class ThreadSignalingExample {
    public static void main(String[] args) {

        Object signalObject  = new Object();
        Thread waitingThread = new Thread(() ->{

            synchronized (signalObject){
                try{
                 signalObject.wait();
                }catch (InterruptedException e){

                }
            }

        });

        Thread notifyThread = new Thread(() -> {
            synchronized (signalObject) {
                signalObject.notify();
            }
        });



    }
}