package Java_practice;

import java.util.Scanner;

public class MathClass {

    public static void main(String[] args) {

        System.out.println(Math.PI);

        Double result;
        result = Math.pow(2,4);
        result = Math.ceil(1.3);
        result = Math.floor(1.9);

        System.out.println(result);
        System.out.println(result);

        //HYPOTENUSE c = Math.sqrt(a2 + b2)

        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        double c;
        System.out.println("enter the value of a ");
        a = sc.nextDouble();
        System.out.println("enter the value of b ");
        b = sc.nextDouble();

        c = Math.sqrt(Math.pow(a,2)+ Math.pow(b,2));
        System.out.println("Hypotenuse for side c is " + c);

    }
}
