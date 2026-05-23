package MultiThreding.Synchronized;


import MultiThreding.JAVA_MEMORY_MODEL.SharedObject;

public class Main {

    public static void main(String[] args) {

//        SynchronizedExchanger synchronizedExchanger = new SynchronizedExchanger();
//
//
//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for(int i = 0;i<1000;i++){
//                    synchronizedExchanger.setObj(" "+i);
//                }
//            }
//        });
//
//        Thread t2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for(int i = 0;i<1000;i++){
//                    System.out.println(synchronizedExchanger.getObj());
//                }
//            }
//        });
//
//        t1.start();
//        t2.start();

        MultipleMoniterObject multipleMoniterObject = new MultipleMoniterObject();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i =0 ;i<100;i++){
                    System.out.println(Thread.currentThread().getName() + "_" +multipleMoniterObject.incCounter1());
                }
            }
        });
        Thread thread2 = new Thread(new Runnable()  {
            @Override
            public void run() {
                for(int i =0 ;i<100;i++){
                    System.out.println(Thread.currentThread().getName() + "_" +multipleMoniterObject.incCounter2());
                }
            }
        });

        thread1.start();
        thread2.start();


        Object object = new Object();
        SharedObjectExchanger sharedObjectExchanger = new SharedObjectExchanger(object);
        sharedObjectExchanger.incCounter();
    }

}

