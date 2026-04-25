package oops.StaticANDdefault;


class Student{
    String name;
    static int studentCount = 0;

    public Student(String name){
        this.name = name;
        studentCount++;
    }

    public static void showTotalCount(){
        System.out.println("total student enrolled: " + studentCount);
    }


}

public class main {
    public static void main(String[] args) {

        Student student = new Student("Aryan");
        Student student1 = new Student("John");

        Student.showTotalCount();

    }
}
