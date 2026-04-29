package CollectionFramework.Comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class MyComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer integer, Integer t1) {
        return t1 - integer;
    }

    // in comparator
    // 1. = 1 default sorting order
    // 2. = 0 return the list as it is
    // 3. = -1 return the list descending order
}
class MyStringComparator implements Comparator<String>{
    @Override
    public int compare(String string, String t1) {
        return string.length() - t1.length();
    }
}

class Student{
    String name;
    double GPA;

   public Student(String name, double GPA){
        this.name = name;
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
}
public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(9);
        list.add(6);
//        list.sort(new MyComparator());

        //with help of java 8
        list.sort((a,b) -> b - a);
        System.out.println(list);

        List<String> groceries = Arrays.asList("banana","milk","choco","waterMelons");
        //traditional method
        groceries.sort(new MyStringComparator());

//        with help of java 8
//        groceries.sort((a,b) -> a.length() - b.length());
        System.out.println(groceries);


        //object sorting
        List<Student> students = new ArrayList<>();
        students.add(new Student("Aryan",3.8));
        students.add(new Student("Robert", 3.9));
        students.add(new Student("Harry",4.0));
        students.add(new Student("Aery",4.0));

//       students.sort((a,b) -> {
//           if(b.getGPA() - a.getGPA() > 0){
//               return 1;
//           } else if (b.getGPA() - a.getGPA() < 0) {
//               return -1;
//           }else{
//               return a.getName().compareTo(b.getName());
//           }
//       });
//        for(Student st : students){
//            System.out.println(st.getGPA() + " " + st.getName());
//        }

        //with help of java 8
        Comparator <Student> comparator = Comparator.comparing(Student::getGPA).reversed().thenComparing(Student::getName);
students.sort(comparator);
        for(Student s : students){
            System.out.println("name:" +s.getName() + "," +s.getGPA());
        }
    }
}






