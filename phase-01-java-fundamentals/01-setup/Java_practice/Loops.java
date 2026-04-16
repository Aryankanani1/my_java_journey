package Java_practice;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        //for loop
//        for(int i = 0; i <= 5; i++) {
//            System.out.println("iteration "+ i);
//        }
//
//        //while loop
       Scanner sc = new Scanner(System.in);
//        int secret = 7 ;
//        int guess = 9;
//        while(guess != secret){
//            System.out.println("guess the number");
//            guess = sc.nextInt();
//        }
//        System.out.println("you guessed the correct number");
//
//        //do-while loop
//        int count = 10;
//        do{
//            System.out.println("even if count is 10, I run once!");
//            count++;
//        } while (count < 5);

        // for each loop
        String fruits [] = {"apples", "mangoes","banana","blueberries"};
        for(String fruit : fruits){
            System.out.println(fruit);
        }


        for(int i= 1 ; i<=20 ; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }

        int i = 0;
        for (System.out.print("Start ");
             i < 1;
             System.out.print("End ")) {
            i++;
        }
int totalSum = 0;
int[] prices = {10,20,30,40,50};
        for(int price : prices){
            totalSum += price;
        }
        System.out.println(totalSum);

        int payment = 0;

        do {
            System.out.println("enter payment amount");
            payment = sc.nextInt();
         } while(totalSum >= payment);

    }
}
