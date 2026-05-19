package MultiThreding.JAVA_MEMORY_MODEL;

class MyRunnable implements Runnable {
    private int count = 0;

    //public MyObject myObject = null;
    public MyObject myObject;

    public MyRunnable(MyObject myObject) {
        this.myObject = myObject;
    }

    @Override
     public void run() {
//        MyObject myobject  = new MyObject();
        System.out.println(myObject);
        for (int i = 0; i < 1_00_000; i++) {
            this.count++;
        }
        System.out.println(Thread.currentThread().getName() + ": " + this.count);
    }
}
