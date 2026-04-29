package CollectionFramework.Comparable;

import java.util.ArrayList;
import java.util.List;

class Student implements Comparable<Student>{
    private String name;
   private double GPA;
    public Student(String name,double GPA){
        this.name =name;
        this.GPA = GPA;
    }

    @Override
    public int compareTo(Student student) {
        return Double.compare(student.getGPA(), this.getGPA());
    }

    public String getName() {
        return name;
    }

    public double getGPA() {
        return GPA;
    }

    @Override
public String toString(){
        return "Name:" +this.name +","+ "GPA:"+this.GPA;
}
}


public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Aryan",4.0));
        list.add(new Student("Merray",3.9));
        list.add(new Student("carry",4.0));
        list.add(new Student("Aery",3.8));
        list.sort(null);
        System.out.println(list);

    }
}
