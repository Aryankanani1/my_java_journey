package MultiThreding.ThreadLocal;

import MultiThreding.MyThread;

class ThreadLocalIntialValueExample {
    public static void main(String[] args) {


        ThreadLocal<MyThread> threadLocal1 = new ThreadLocal<>() {
            @Override
            protected MyThread initialValue() {
                return new MyThread();
            }
        };

        ThreadLocal<MyThread> threadLocal2 = ThreadLocal.withInitial(() -> {
            return new MyThread();
        });


        Thread t1 = new Thread(() -> {
            System.out.println("thread 1:" + threadLocal1.get());
            System.out.println("thread 2:" + threadLocal1.get());
        });

        Thread t2 = new Thread(() -> {
            System.out.println("thread 1:" + threadLocal2.get());
            System.out.println("thread 2:" + threadLocal2.get());
        });

        t1.start();
        t2.start();
    }
}
