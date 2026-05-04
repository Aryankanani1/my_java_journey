package Generics;

class Bot{
//    public <T extends Number> Bot(T value){
//        // generic constructor
//    }


    public <T> void  minBot(T []value){
        for(T i : value){
            System.out.println(i);
        }

    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
Bot bot = new Bot();
Integer [] integers = {1,2,3,4,5,6};
String [] strings = {"aryan","kanani","banana"};
bot.minBot(integers);
bot.minBot(strings);
    }
}
