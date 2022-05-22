package assigment3;

public class Odd_even {
	 
	void oddeven(int input) {
		if(input<0) {
			System.out.println("error");
		}else if(input%2==1) {
			System.out.println(input);
		}else if(input%2==0) {
			if(input%10==0) {
				System.out.println(input);
			}else {
				for(int i= input;true;i++) {
					if(i%10==0) {
						System.out.println(i);
						break;
					}
				}
			}
		}
	}
	public static void main(String[] args) {
	new Odd_even().oddeven(12);
		
	}
}
