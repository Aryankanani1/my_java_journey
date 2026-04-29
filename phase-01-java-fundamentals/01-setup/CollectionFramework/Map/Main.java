package CollectionFramework.Map;

import java.util.*;

class Hash{

    public int SimpleHashFunction(String key){

        int sum = 0;
        for(char c : key.toCharArray()){
             sum += (char) c;
        }
        return sum % 10;
    }
}

class Student{
    String name;
    int id;

    Student(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student() {
        super();
    }
    @Override
    public int hashCode(){
        return Objects.hash(this.name,this.id);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        Student st = (Student) obj;
        return this.id == st.getId() && Objects.equals(this.name,st.getName());
    }

    @Override
    public String toString() {
        return "id: " + this.id + "," + "name: " + this.name ;
    }
}
public class Main {
    public static void main(String[] args) {

        HashMap<Student, String> roles = new HashMap<>();
        Student st1 = new Student("Aryan",1);
        Student st2 = new Student("Robert",2);
        Student st3 = new Student("Aryan",1);

        System.out.println(st1);

        roles.put(st1,"engineer");
        roles.put(st2,"front-end");
        roles.put(st3,"back-end");

        System.out.println(roles.get(st1));
        System.out.println(roles.get(st3));
        System.out.println("hashmap size " + roles.size());

        HashMap<Integer, String> register = new HashMap<>();

        register.put(1, "Aryan");
        register.put(2, "Robert");
        register.put(3, "Mahesh");
        //get or default value
        String name = register.getOrDefault(4,"Null");
        System.out.println("------------");
        System.out.println(name);
        System.out.println(register);

        System.out.println(register.containsKey(1));

        String s = register.get(1);
        System.out.println(s);


        //looping the map
        // just convert the mapkey to set
        // map = key is unique
        // set = doesn't contains duplicate

        Set<Integer> keySet = register.keySet();
        for(int i : keySet){
            System.out.println(register.get(i));
        }

        // map in set
        Set<Map.Entry<Integer,String>> enteries = register.entrySet();
        //this is nothing but entry type of enteries
        for (Map.Entry<Integer,String> entry : enteries){

            //coverting all values into capital letters
            entry.setValue(entry.getValue().toUpperCase());
//            System.out.println("key: "+ entry.getKey() +"->"+ "value: "+entry.getValue());
        }
        System.out.println(register);


        Hash h = new Hash();
        System.out.println(h.SimpleHashFunction("aarn"));




    }
}



