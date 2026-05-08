package JAVA8.AnonymousClass;

public class Main {

    private static void operation (){

        int a = 10;

        JAVA8.FunctionalInterface.Employee e = () -> {
            // local variable
            return "software Engineer";
        };

        Employee employee = new Employee() {
            // instance variables
            int a = 10;
            @Override
            public String salary() {
                return null;
            }

            @Override
            public String designation() {
                return null;
            };
        };

    }


    public static void main(String[] args) {

        // anonymous inner class
        Employee e = new Employee() {
            @Override
            public String salary() {
                return "18000";
            }

            @Override
            public String designation() {
                return "SDE 1";
            }
        };

        System.out.println( e.designation()+"_"+
        e.salary());
    }



}
