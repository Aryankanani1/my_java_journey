package Java_practice.oops;

public class Student {
    // Fields (State)
    String name;
    String major;
    double gpa;
    //Constructor: "initialization"
    public Student(String name, double gpa,String major){
        this.name = name;
        this.gpa = gpa;
        this.major = major;
    }

    public void Which_major(String name,String major){
        System.out.println(this.name = name + "is studying" + major);
    }

    public static void main(String[] args) {

        Student sc = new Student("aryan",3.9,"computer science");
        sc.Which_major("kanani","computer science");



    }
}
