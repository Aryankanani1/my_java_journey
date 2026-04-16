package Java_practice.Strings;

public class Stringclass {
    public static void main(String[] args) {



        // the basic : immutability
        String name = "aryan_kanani";
        System.out.println(name);


        // in string constant pool it will create entire new object
        name = name+"1";
        System.out.println(name);

        String name1 = new String("aryan_kanani");
        System.out.println(name1);

        //equals() vs ==
        String s1 = "hello";
        String s2 = new String ("hello");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));


        // string methods
       // Returns the number of characters.
        System.out.println(s1.length());

        // Returns the character at a specific position.
        System.out.println(s1.charAt(0));

        // Extracts a portion of the string.
        System.out.println(s1.substring(0,4));

        // Removes leading and trailing whitespace.
        System.out.println(s1.trim());

        // Checks for specific patterns.
        System.out.println(s1.contains("ol"));


    }
}
