package assigment3;

public class Demo {
	public Demo() {
		System.out.println("Empty form");
	}
	public Demo(String a) {
		this();
		System.out.println("String "+a);
	}
	public Demo(int a) {
		this("dhawa");
		System.out.println("int "+a);
	}
	public Demo(float a) {
		this(1);
		System.out.println("float "+a);
	}
	public static void main(String[] args) {
		new Demo(2.5f);

	}
}
