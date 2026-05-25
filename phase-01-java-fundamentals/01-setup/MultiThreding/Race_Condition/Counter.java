package MultiThreding.Race_Condition;

class Counter {

private long count = 0;


public  long increment(){
    this.count++;
    return this.count;
}

public long get(){
    return this.count;
}


}
