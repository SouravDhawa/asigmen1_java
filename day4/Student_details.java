package assigment3;

public class Student_details {

	private int roll;
	private String name;
	private int age;
	private int marks;
	
	public Student_details() {
		
	}
	public void setroll(int roll) {
		this.roll=roll;
	}
	public int getroll() {
		return roll;
	}
	public void setname(String name) {
		this.name=name;
	}
	public String getname() {
		return name;
	}
	public void setage(int age) {
		this.age=age;
	}
	public int getage() {
		return age;
	}
	public void setmarks(int marks) {
		this.marks=marks;
	}
	public int getmarks() {
		return marks;
	}
	
	public Student_details(int roll,String name,int age,int marks) {
		this.roll=roll;
		this.name=name;
		this.age=age;
		this.marks=marks;
	}
	
	
	public void Student() {
		if(age>18  && age<60 && 0<marks && marks<500) {
			System.out.println(roll);
			System.out.println(name);
			System.out.println(age);
			System.out.println(marks);
		}else {
			System.out.println("age should be between 18 & 60 & marks should be 0 to 500");
		}
	}
	
	
	
	
	
	
}
