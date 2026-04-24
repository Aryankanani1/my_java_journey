package oops.Polymorphism;


class BankAccount{

    private double balance;
    public BankAccount(double intialBalance) {
        this.balance = intialBalance;
    }

    // complietime polymorphism (overloading)
    public void deposit(double amount){
        this.balance += amount;
    }

    public void deposit(double amount,String notes){
        this.balance += amount;
        System.out.println("Deposited: " + amount + "| Note: " + notes);
    }

    void applyInterest(){
        System.out.println("avg interest rate is 0.04 percent");
    }

    public void applyMonthlyfees(){
        System.out.println("monthly fee will be applied");
    }


    public void deposit(){
        System.out.println("you have only 500 money");
    }
}

class SavingsAccount extends BankAccount{

    public SavingsAccount(double intialBalance){
        super(intialBalance);
    }
    @Override
    void applyInterest(){
        System.out.println("saving interest rate is 4.0 percent");
    }

    public void applyMonthlyfees(){
        System.out.println("monthly fees will be waived for the savings account");
    }

}
public class MainRunner {
    public static void main(String[] args) {

        BankAccount account1 = new SavingsAccount(100.00);
        account1.applyInterest();
        account1.applyMonthlyfees();
        account1.deposit(100.00);
        account1.deposit(100.00,"from aryan");
    }
}
