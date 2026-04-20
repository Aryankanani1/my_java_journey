package Java_practice.oops;

public class ThisandSuper {
    private String researchTopic;
    private double gpa;

    // Default constructor
   public ThisandSuper(String researchTopic, double gpa){
       this.researchTopic = researchTopic;
       this.gpa = gpa;
   }

    public static void main(String[] args) {
        ThisandSuper ts = new ThisandSuper("AI graph",3.9);
        System.out.println(ts);
    }
}
