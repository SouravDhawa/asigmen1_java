package assigment3;

public class Student {
	public static void main(String[] args) {
		Student_details s1=new Student_details();
		s1.setroll(12);
		s1.setname("sourav");
		s1.setage(24);
		s1.setmarks(56);
		s1.Student();
		
		Student_details s2=new Student_details(12,"dhawa",45,56);
		s2.Student();
		
	}
}
