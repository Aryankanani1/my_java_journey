package MultiThreding;
class C extends Thread{
    @Override
    public void run(){
        while (true){
            System.out.println("hello world");
        }
    }
}
public class DaemonDemo {
    public static void main(String[] args) {

        C c = new C();
        c.setDaemon(true);
        c.start();
        C c1 = new C();
        c1.start(); // user thread JVM can't able to ignore this thread 
        System.out.println("program finished");


    }
}
