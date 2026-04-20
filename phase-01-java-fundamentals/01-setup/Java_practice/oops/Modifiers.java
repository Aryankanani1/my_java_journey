package oops;

public class Modifiers {

    public String name; // Everyone can see and access it
    protected String ssn; // only children and classes in the same package

    String department; // only class in the same package

    private double salary; // only inside this classes
}
