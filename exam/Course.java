package fast_exam;

public class Course {
    int courseid;
    String courseName;
    int courseFee;

    public int getCourseid(){
        return courseid;
    }
    public void setCourseid(int courseid){
        this.courseid=courseid;
    }
    public String getcourseName(){
       return courseName;
    }
    public void setcourseName(String courseName){
        this.courseName=courseName;
    }
    public int getcourseFee(){
        return courseFee;
    }
    public void setcourseFee(int courseFee){
        this.courseFee=courseFee;
    }

    public  void displayCourseDetails(){
        System.out.println(this.courseid);
        System.out.println(this.courseName);
        System.out.println(this.courseFee);
    }
    static void authenticate(String username,String password){
        if(username.equals("Admin")  &&  password.equals("1234")){
            Course c1=new Course();
            c1.setCourseid(123);
            c1.setcourseName("java");
            c1.setcourseFee(1234);
            c1.displayCourseDetails();
        }else{
            System.out.println("Invalid user name and password");
        }
    }

    public static void main(String[] args) {
        Course s1=new Course();

        s1.authenticate("sgd","gdg");
        s1.authenticate("Admin","1234");
    }
}
