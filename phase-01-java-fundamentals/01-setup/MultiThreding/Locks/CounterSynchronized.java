package MultiThreding.Locks;

public class CounterSynchronized {
    private int count = 0;

    public synchronized void increament(){
        this.count++;
    }

    public int getCount(){
        return this.count;
    }

}
