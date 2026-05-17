package MultiThreding;
class A extends Thread{
    @Override
    public void run(){
        for(int i=0;i<=2;i++){
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                System.out.println(e.fillInStackTrace());
            }
            System.out.println(i);
        }
    }
}

class B extends Thread{

    public B(String name){
        super(name);
    }


    @Override
    public void run(){
        for(int i = 0; i<=5;i++){
            System.out.println(Thread.currentThread().getName() +" Priority: " +Thread.currentThread().getPriority());
            Thread.yield(); // means tell the cpu or schdular to give some times to other thread
            try{

                Thread.sleep(2000);
            }
            catch (Exception e){
                System.out.println(e.fillInStackTrace());
            }
        }
    }
}


public class MethodClass {
    public static void main(String[] args) throws InterruptedException {
//        A a = new A();
//        a.start();
//        a.setPriority(Thread.MIN_PRIORITY);
//        System.out.println(a.getState());
//        a.join(); // wait till other method finished then main method execute
//        System.out.println("hello world");

        B b = new B("th-1");
        B b1  = new B("th-2");
        B b2 = new B("th-3");
        b.setPriority(Thread.MAX_PRIORITY);
        b1.setPriority(Thread.NORM_PRIORITY);
        b2.setPriority(Thread.MIN_PRIORITY);
        b.start();
        b1.start();
        b2.start();
    }
}


