package assigment2;

public class student_details {
	int roll;
	String name;
	int marks;
	void displayStudentDetails (int roll,String name,int marks) {
		System.out.println("roll is: "+roll+"\n"+"name is: "+name+"\n"+"marks is: "+marks);
	}
	public static void main(String[] args) {
		student_details st=new student_details();
		student_details st1=new student_details();
		
		st.roll=25;
		st.name="sourav";
		st.marks=100;
		
		st1.roll=29;
		st1.name="tuhin";
		st1.marks=90;
		st.displayStudentDetails(st.roll,st.name,st.marks);
		st1.displayStudentDetails(st1.roll,st1.name,st1.marks);
		
		st=null;
		st1=null;
	}
}
