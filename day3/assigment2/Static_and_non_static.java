package assigment2;

public class Static_and_non_static {
	static int x;
	int y;
	public static void main(String[] args) {
		Static_and_non_static t1 =new Static_and_non_static();
		x=45;
		t1.y=12;
		
		System.out.println(x);
		System.out.println(t1.y);
	}
}
/*load all the static member inside the ram so that they will be availble to 
the cpu for exetuion .here non static member will ther inside the hardisk only
among all static members jvm will find out the main method and call the methode 
to exicute our application */