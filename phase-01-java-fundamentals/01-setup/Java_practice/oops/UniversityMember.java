package oops;

public class UniversityMember  {
    String universityname;

    public UniversityMember(String universityname){
        this.universityname = universityname;
    }
}

class Student extends UniversityMember{

    String major;

    public Student(String major, String universityname){
        super(universityname);
        this.major = major;
    }

    public void printdetails(){
        System.out.println("student's university is " +super.universityname);
        System.out.println("student major is " +this.major);
    }
    public static void main(String[] args) {
       Student student1 = new Student("computer_science","Florida atlantic university");
        student1.printdetails();
    }
}

