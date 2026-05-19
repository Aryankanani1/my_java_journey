package MultiThreding;

public class VirtualThreadExample {
    public static void main(String[] args) {


        Runnable runnable = () -> {

            for(int i = 0 ;i < 100 ; i++){
                System.out.println(i + "index");
            }
        };

        Thread startedThread = Thread.ofVirtual().start(runnable);
        Thread unStartedThread = Thread.ofVirtual().unstarted(runnable);
        unStartedThread.start();


    }
}
