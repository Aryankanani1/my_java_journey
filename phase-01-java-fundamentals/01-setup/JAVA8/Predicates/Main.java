package JAVA8.Predicates;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
class Student{

    int id;
    String name;

    Student(int id , String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return "id:" +this.id +"_"+ "name:"+this.name;
    }
}
public class Main {

    static int a = 10000;

    public static void main(String[] args) {
        Predicate<Integer> checkValue = x -> x > Main.a;

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = numbers.stream().filter(x -> x % 2 == 0).mapToInt(n -> n).sum();
        System.out.println(sum);

//        System.out.println(checkValue.test(10000));
        if (checkValue.test(100000)) {
            System.out.println("you reached edge of the universe");
        } else {
            System.out.println("sorry you can't able to ascape");
        }

        Predicate<String> startWithLetter = x -> x.charAt(0) == 'A';
        Predicate<String> endWithLetter = x -> x.charAt(x.length() - 1) == 'Z';
        Predicate<String> both = startWithLetter.and(endWithLetter);
        List<String> l = Arrays.asList("Aryan", "AananZ", "Aey", "Aee", "Army");
        for (String s : l) {
            if (both.test(s)) {
                System.out.println(s);
            } else {
                System.out.println("hehehe");
            }
        }

        Predicate<Student> studentPredicate = x -> x.getId() > 1;
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1,"Aryan"));
        studentList.add(new Student(2,"Robert"));
        studentList.add(new Student(3,"Remmy"));

        for(Student s : studentList){
          if (studentPredicate.test(s))
          {
              System.out.println(s.toString() + "Matched");
          }
          else {
              System.out.println(s.toString() + "Not Matched");
          }
      }
    }
}
