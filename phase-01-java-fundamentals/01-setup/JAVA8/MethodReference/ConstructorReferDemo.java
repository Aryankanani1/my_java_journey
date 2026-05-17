package JAVA8.MethodReference;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{

    String name;

   public Student (String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
public class ConstructorReferDemo {
    public static void main(String[] args) {

         List<String> list = (Arrays.asList("Aryan","kanani","robert"));
            //construction reference
         List<Student> students = list.stream().map(Student::new).collect(Collectors.toList());
      //list.stream().map(x -> new Student(x)).collect(Collectors.toList());

        System.out.println(students);
//        for(Student  s: students){
//            System.out.println(s);
//        }
    }
}


