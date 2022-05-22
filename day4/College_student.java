package assigment3;

public class College_student {
	int roll;
	String name;
	String address;
	String collegename;
	
	public College_student() {
		
	}
	public void set_roll(int roll) {
		this.roll=roll;
	}
	public int get_roll() {
		return roll;
	}
	public void set_name(String name) {
		this.name=name;
	}
	public String get_name() {
		return name;
	}
	public void set_address(String address) {
		this.address=address;
	}
	public String get_address() {
		return address;
	}
	public void set_collegename(String collegename) {
		this.collegename=collegename;
	}
	public String get_collegename() {
		return collegename;
	}
	public void ifstudentNIT() {
		System.out.println("roll is:"+this.roll);
		System.out.println("Name is"+this.name);
		System.out.println("Address is: "+this.address);
		System.out.println("collage name is:"+this.collegename);
		
	}
	public void ifStudentareNotNIT() {
		System.out.println("roll is:"+this.roll);
		System.out.println("Name is"+this.name);
		System.out.println("Address is: "+this.address);
		System.out.println("college nae is: "+this.collegename);
	}
	public static void main(String[] args) {
		College_student c1=new College_student();
		c1.set_roll(12);
		c1.set_name("sourav");
		c1.set_address("balighai");
		c1.set_collegename("jld");
		
		c1.set_roll(12);
		c1.set_name("sourav");
		c1.set_address("balighai");
		c1.set_collegename("NIT");
		
		if(c1.collegename =="NIT") {
			c1.ifstudentNIT();
		}
		else {
			c1.ifStudentareNotNIT();
		}
	}
}
