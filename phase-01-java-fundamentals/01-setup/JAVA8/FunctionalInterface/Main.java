package JAVA8.FunctionalInterface;

public class Main {
    public static void main(String[] args) {


        // functional interface = lambda expression
        Employee e = () -> "softWareEngineer";
        System.out.println(e.getName());
        Employee e1 = () -> "Editor";
        System.out.println(e1.getName());

        Runnable run = ()  -> {
            for(int i= 1;i<=10;i++)
            {System.out.println("Hello " + i);
            }
        };
          Thread childThread = new Thread(run);
          childThread.run();

    }
}

