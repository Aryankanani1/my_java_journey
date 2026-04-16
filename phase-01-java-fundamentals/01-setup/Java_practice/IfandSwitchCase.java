package Java_practice;

import java.util.Scanner;

public class IfandSwitchCase {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
//        System.out.println("enter your age for the verification");
//        int age = sc.nextInt();
//
//        if(age >= 18){
//            System.out.println("you are an adult");
//        } else if (age <= 0 ) {
//            System.out.println("you are not born yet");
//        }
//            else {
//            System.out.println("you are child right now");
//        }


        double income = 50000.75;
        int tier = 2;
        double taxRate;

// Logic Task:
// 1. If tier is 1, taxRate is 0.10
// 2. If tier is 2, taxRate is 0.20
// 3. Use a Ternary to decide the final amount:
//    If income is > 30000, cast it to an int and subtract 500,
//    otherwise keep it as is.

        if (tier == 1) {
            taxRate = 0.10;
            System.out.println(taxRate);
        } else
            taxRate = 0.20;
        System.out.println(taxRate);

        double re = (income > 30000) ? (int) income - 500 : income;
        System.out.println(re);


        //switch case statement
        System.out.println("enter the number");
        int number = sc.nextInt();

        String dayType = switch (number) {
            case 1, 2, 3, 4, 5 -> "weekday";
            case 6, 7 -> "weekend";
            default -> "invalid day";
        };
        System.out.println(dayType);

//old way
        System.out.println("choose your size");
        System.out.println("Small -> $2");
        System.out.println("Medium -> $4");
        System.out.println("Large -> $6");
        int price = sc.nextInt();
        String totalPrice = switch (price){
            case 2 -> "you select small coffee"
            + "your total price is $"+price;
            case 4 -> "you select medium coffee" +
                    "your total price is $"+price;
            case 6 -> "you select large coffee"+
                    "your total price is $"+price;
            default -> "invalid selection";
        };
        System.out.println(totalPrice);


        System.out.println("Enter Membership (Sliver/Gold): ");
        String type = sc.next();

        System.out.println("Enter Purchase Amount: ");
        double amount = sc.nextDouble();

        double discount = switch (type.toLowerCase()){
            case "gold" -> amount > 100 ? 0.20 : 0.15;
            case "silver" -> amount > 100 ? 0.15 : 0.10;
            case "bronze" -> amount > 100 ? 0.10 : 0.5;
            default -> 0.0;
        };
        System.out.println("your discount on purchase is " + (discount * 100) + "%");
    }
}
