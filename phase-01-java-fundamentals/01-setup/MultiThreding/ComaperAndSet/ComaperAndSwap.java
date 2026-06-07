package MultiThreding.ComaperAndSet;

import MultiThreding.MyLock;

import java.util.concurrent.atomic.AtomicBoolean;

public class ComaperAndSwap implements MyLock {
    private AtomicBoolean atomicLocked = new AtomicBoolean(false);

    @Override
    public void unlock() {
this.atomicLocked.set(false);
    }

    @Override
    public void lock() {

        while(!this.atomicLocked.compareAndSet(false,true)){

        }

    }
}
