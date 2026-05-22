package MultiThreding.Synchronized.ReEntrance;

public class ReEntrance {
    private int count ;

    public synchronized void inc(){
        this.count++;
    }

    /* however if two methods are synchronized on the same monitor object
    and one method called in the synchronized method(which is also synchronized on the same monitor object)
    it can reenter in that called method without any restriction
    in short(the thread will not block the other thread to call the first synchronized block)
    */

    public synchronized int getReEnterance(){
        inc();
        return this.count;
    }
}
