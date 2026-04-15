package Java_practice;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age for the verification");
        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("you are an adult");
        } else if (age <= 0 ) {
            System.out.println("you are not born yet");
        }
            else {
            System.out.println("you are child right now");
        }
    }
}
