package MultiThreding.ComaperAndSet;

import java.util.concurrent.atomic.AtomicLong;

public class OptimisticLocking implements Counter {

private AtomicLong count = new AtomicLong();

public void inc(){

    boolean successFul = false;
// can enter two or more thread but can't perform until the value changed by other thread
    while(!successFul){
        long value = this.count.get();
       long newValue = value + 1;

       successFul = this.count.compareAndSet(value,newValue);
    }
}
}
