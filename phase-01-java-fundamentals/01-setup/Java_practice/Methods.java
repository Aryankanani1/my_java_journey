package Java_practice;

public class Methods {

    public static void First_name(String name){
        System.out.println("my name is " + name);
    }
public static void Your_FAV_fruits(String... name){
  for(String fruits : name){
      System.out.print(fruits + " ");
  }
}

    public static void main(String[] args) {
        //First_name("aryan");
        Your_FAV_fruits("watermelon");
        Your_FAV_fruits("Mango","kiwi","banana");

    }

}









