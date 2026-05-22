package MultiThreding.Synchronized;

class MultipleMoniterObject {

    private Object object1 = new Object();
    private Object object2 = new Object();


    private int counter1 = 0;
    private int counter2 = 0;

    public int incCounter1(){
            synchronized (this.object1){
               return this.counter1++;
            }
    }

    public int incCounter2(){
        synchronized (this.object2){
           return this.counter2++;
        }
    }
}
