package Object_class;


import java.util.Objects;

class Student extends Object{
    private int id;
    private String name;

    public Student(int id, String name){
        id++;
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString(){
        return "StudentId" + id + "," + "StudentName" + name;
    }

}

class Laptop{

    String serialNumber;
    String brand;

    Laptop(String serialNumber, String brand){
        this.serialNumber = serialNumber;
        this.brand = brand;
    }

    public boolean equals(Object o){
        // compare the current object and gradParent object
        if(this == o){
            return true;
        }

        if (o == null || this.getClass() != o.getClass()){
            return false;
        }

        Laptop otherLaptop = (Laptop) o;
        return Objects.equals(this.serialNumber,otherLaptop.serialNumber);
    }

    @Override
    public int hashCode(){
        return Objects.hash(serialNumber);
    }
}

public class Main {
    public static void main(String[] args) {

             Student stu1  = new Student(1,"Aryan");
             System.out.println(stu1.toString());
             Laptop lenevo = new Laptop("1234","lenevo");
             System.out.println(lenevo.equals(new Laptop("1234","lenevo")));
             System.out.println(lenevo.getClass());


    }
}
