package assigment1;

public class Prime_factor {
	public static void main(String[] args) {
		int num=68;
		if(num>1 & num<=100) {
			for(int i=1;i<num;i++) {
				if(num%i==0) {
					System.out.println(i);
				}
				
			}
		}else {
			System.out.println("Invalid number");
		}
	}
}
