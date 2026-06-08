package MultiThreding.FalseSharing;

class FalseSharingExample {

    public static void main(String[] args) {

//
//        Counter1 counter1 = new Counter1();
//        // sharing same object
//        //Counter1 counter2 = counter1;
//        Counter1 counter2 = new Counter1();
        Counter2 counter1 = new Counter2();
        Counter2 counter2 = counter1;


        long iterations = 1_000_000;

        Thread t1 = new Thread(() -> {
            long startTime = System.currentTimeMillis();
            for (long i = 0; i < iterations; i++) {
                counter1.count1++;
            }
            long endTime = System.currentTimeMillis();
            System.out.println("total time " + (endTime - startTime));
        });

        Thread t2 = new Thread(() -> {
            long startTime = System.currentTimeMillis();
            for (long i = 0; i < iterations; i++) {
                counter2.count2++;
            }
            long endTime = System.currentTimeMillis();
            System.out.println("total time " + (endTime - startTime));
        });


        t1.start();
        t2.start();
    }
}

