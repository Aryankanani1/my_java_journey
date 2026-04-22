package oops.Encapsulation;

public class Student {

private String studentId;
private double gpa;

public void setGpa(Double gpa){
    if(gpa >= 0.0 && gpa <= 4.0){
        this.gpa = gpa;
    }
    else {
        System.out.println("return invalid gpa");
    }
}

public void setStudentId(String studentId){
    if(studentId.length()==5){
        this.studentId = studentId;
    }
    else {
        System.out.println("return invalid id");
    }
}

public String getstudentInfo(){
    if(studentId == null){
        return "invalid info";
    }
    return "student id "+ studentId + "|" + "gpa" + gpa;
}

    public static void main(String[] args) {
        Student st = new Student();
        st.setStudentId("2345");
        st.setGpa(4.0);
        System.out.println(st.getstudentInfo());
    }
}
