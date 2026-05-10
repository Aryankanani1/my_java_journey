package JAVA8.Function;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
class Student{
    String name;

    Student(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
   public String toString(){
        return this.name;
    }

}
public class Main {
    public static void main(String[] args) {

        //predicate --> boolean function
        //function --> operation function
        //consumer --> void type (return nothing)
        //supplier




//        List<String> list = new ArrayList<>();
//        list.add("Aryan");
//        list.add("Robert");
//        list.add("x");
//        list.add("y");
//        list.add("z");
//
        Function <String ,Integer> function = x -> x.length();
        Function<String,String> function1 = x -> x.substring(0,3);
//        System.out.println(function1.apply("Aryan"));
//
//        int capacity = 0;
//        for(String s : list){
//         capacity+= function.apply(s);
//        }
//        System.out.println(capacity);
//
////
//       Function<List<Student>, List<Student>> vipStudent = x -> {
//            List<Student> list1 = new ArrayList<>();
//        for(Student s : x){
//               if(function1.apply(s.getName()).equalsIgnoreCase("VIP")){
//                  list1.add(s);
//               }
//           }
//           return list1;
//        };
//      Student s1 =  new Student("VIParyan");
//     Student s2 =   new Student("VIProbert");
//     Student s3 =  new Student("robert");
//      Student s4 =  new Student("aryanVIP");
//      List<Student> studentList = Arrays.asList(s1,s2,s3);
//      List<Student> students = vipStudent.apply(studentList);
//        System.out.println(students);



        // function chaining step 1
        Function<String,String> f1 = x -> x.toUpperCase();
        Function<String,String> f2 = x -> x.substring(0,3);
        Function<String,String> f3 = f1.andThen(f2);
        System.out.println(f3.apply("VIPARYAN"));

        // step 2 direct join the function
        System.out.println(f1.andThen(f2).apply("VIPARYAN"));
        System.out.println(f2.andThen(f1).apply("VIPARYAN"));


        // compose
        System.out.println(f1.compose(f2).apply("VIPARYAN"));




    }
}
