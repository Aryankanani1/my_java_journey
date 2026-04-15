package Java_practice;

public class Arithmetic {

    public static void main(String[] args) {


        int x = 10;
        int y = 2;

//        int z = x+y;
       // System.out.println(z);

        // Augmented Assignment operator
         x += y;
        System.out.println(x);

        x -= y;
        System.out.println(x);

        x -= x + y;
        System.out.println(x);

// y = (x*y)/(x+y)-x;
        System.out.println(y);

    }
}
