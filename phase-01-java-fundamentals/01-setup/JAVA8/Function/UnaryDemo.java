package JAVA8.Function;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryDemo{
    public static void main(String[] args) {


        // we don't have to write the function because it is already implemented by the UnaryOperator
        UnaryOperator<Integer> unaryOperator = x -> x * x;
        System.out.println(unaryOperator.apply(5));

        // Bifunction
        BiFunction<String,String,String> biFunction = (str1,str2) -> str1+"_"+str2;
        System.out.println(biFunction.apply("Aryan","Kanani"));


        //Binaryoperator
        BinaryOperator<String> binaryOperator = (str1,str2) -> str1+"_"+str2;
        System.out.println(binaryOperator.apply("Robert","downey"));

    }
}



