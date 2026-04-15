package Java_practice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter your name");
//        String name = sc.nextLine();
//        System.out.println(name +  " is learning java");



//Shopping cart

        System.out.println("what item would you like to buy? ");
        String itemName = sc.nextLine();
        System.out.println("what is the price for each? ");
        double price = sc.nextDouble();
        System.out.println("how many would you like?");
        int count = sc.nextInt();

        double total = price * count;

        System.out.println("you have bought " + count +" "+ itemName + "/s");
        System.out.println("your total is $" + total);



    }
}
