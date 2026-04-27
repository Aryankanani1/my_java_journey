package Exception_Handling;

class BankAccount{

    double balance;

   public BankAccount (double amount){
       this.balance = amount;
   }

   void withdrawal(double amount) throws Exception {
           if (balance < amount){
               throw new InsufficientBalanceException();
       }
}
   }

//custom exception
class InsufficientBalanceException extends Exception{
    @Override
    public String toString(){
        return "you don't have enough money";
    }

}
public class Main {
    public static void main(String[] args) throws Exception {
            //stacktrace which gives you the full message and detail about the exception
           try{
               level1();
           }catch (Exception e){
               System.out.println(e);
           }

        int numerator[] = {2,4,6,8,10};
        int denominator [] = {1,2,3,0,5};
        for (int i = 0; i < 10;  i++){
            try {
                System.out.println(divide(numerator[i],denominator[i]));
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
        }

        System.out.println("10 out to 10");


        BankAccount user1 = new BankAccount(110);
        try {
            user1.withdrawal(115);
        }
        catch (InsufficientBalanceException e){
            System.out.println(e.toString());
        }
    }
    public static int divide(int a, int b){

        try{
            return a/b;
            } catch (ArithmeticException e){
            System.out.println(e.fillInStackTrace());
return -1;
        }
    }

    public static void level3(){
        int arr [] = new int[6];
        arr[6] = 19;
    }

    public static void level2(){
       level3();
    }
     public static void level1(){
        level2();
     }
}
