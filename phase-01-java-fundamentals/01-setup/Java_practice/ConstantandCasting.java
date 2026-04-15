package Java_practice;

public class ConstantandCasting {
    public static void main(String[] args) {

        //constant
        final double PI = 3.14;
        System.out.println(PI);

        //casting

        int a = 10 ;
        System.out.println(a);

        double a1 = a;
        System.out.println(a1);

        // explicit casting
      double price = 9.19;
      System.out.println(price);
      int roundprice = (int) price;
        System.out.println(roundprice);
    }
}
