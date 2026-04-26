package Enum;

import javax.print.attribute.standard.RequestingUserName;
import java.sql.SQLOutput;


enum AccountType {

    SAVINGS(0.04),
    CHECKING(0.01),
    FIXED_DEPOSIT(0.07);

   private final double interestRate;


   //Constructor (must be private or package-private)
 AccountType (double interestRate){
       this.interestRate = interestRate;
   }

   public double getInterestRate(){
   return this.interestRate;
   }


}

enum Status{

    PENDING,
    PROCESSING,
    COMPLETED,
    FAILED;
}

enum UserRole {
    ADMIN("All Access"),
    EDITOR("Edit Only"),
    VIEWER("Read Only");

    private String permission;
    UserRole(String permission){
        this.permission = permission;
    }


    @Override
    public String toString() {
       return "role: " + this.permission.toLowerCase();
    }

    public String systemAccess(String role){
        if(role.equals(ADMIN.permission)){
            return "access the system";
        }
        return "can not access the system";
    }
}
public class Main{
    public static void main(String[] args) {
        AccountType myType = AccountType.SAVINGS;
        System.out.println("Account: "+ myType);
        System.out.println("Rate: "+myType.getInterestRate());


        for(AccountType allType: AccountType.values()){
            System.out.println(allType.getInterestRate());
        }

        Status TransactionStatus = Status.PROCESSING;
        // return the current name
        System.out.println(TransactionStatus.name());

        // return the position (index) starting at 0
        System.out.println(TransactionStatus.ordinal());

        // return the array of all constants (Great for loops!)
        for(Status s : Status.values()){
            System.out.println(s.name());
        }

        UserRole role = UserRole.ADMIN;
        System.out.println(role.systemAccess("Access"));

        for(UserRole allRole : UserRole.values()){
            System.out.println("["+allRole.toString()+"]");
        }
    }
}
