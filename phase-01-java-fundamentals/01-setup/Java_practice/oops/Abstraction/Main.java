package oops.Abstraction;

interface BankTask {

    // standard abstract method (must be overridden)
    void executeTransaction();

    // default method (Optional to override)
    default void logTransaction(){
        System.out.println("this is transaction log");
    }


    // static method (can't be overridden)
    static void printBankClosingtime(){
        System.out.println("All branches close at 5:00 pm.");
    }
}

class Withdrawal implements BankTask{
    @Override
    public void executeTransaction() {
        System.out.println("withdraw cash");
    }
}

public class Main{
    public static void main(String[] args) {
Withdrawal w = new Withdrawal();
w.logTransaction();
w.executeTransaction();
// don't have to call the object it save the space
BankTask.printBankClosingtime();
    }
}


