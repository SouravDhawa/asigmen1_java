package fast_exam;

public class Student_details {
    int rollNumber;
    String studentName;
    int marks;

    public Student_details(){

    }
    public int getRollNumber(){
        return rollNumber;
    }
    public void setRollNumber(int rollNumber){
        this.rollNumber=rollNumber;
    }
    public String getStudentName(){
        return studentName;
    }
    public void setStudentName(String studentName){
        this.studentName=studentName;
    }
    public int getMarks(){
        return marks;
    }
    public void setMarks(int marks){
        this.marks=marks;
    }
    public Student_details(int rollNumber,String studentName,int marks){
        this.rollNumber=rollNumber;
        this.studentName=studentName;
        this.marks=marks;
    }
    public void student(){
        System.out.println(rollNumber);
        System.out.println(studentName);
        System.out.println(marks);
    }

    public static void main(String[] args) {
        Student_details s1=new Student_details();
        s1.setRollNumber(12);
        s1.setStudentName("sourav");
        s1.setMarks(45);
        s1.student();
    }
}
