package BuiltInClasses;


class User {
    private static String name;
    class JavaUser{
        void intro(){
            System.out.println("hi i am the java user");
        }
    }

    static class FronEnd{
        void work(){
            System.out.println("hi i am from front-end department");
        }
    }
}

public class main {
    public static void main(String[] args) {

// inner class
User u = new User();
User.JavaUser java = u.new JavaUser();
java.intro();


// static class
        User.FronEnd fronEnd = new User.FronEnd();
        fronEnd.work();
    }
}
