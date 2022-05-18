package assigment1;

public class Cricket_score {
	public static void main(String[] args) {
		int total_run=30;
		int run_by_ball=6;
		
		switch (run_by_ball) {
		case 1:total_run+=run_by_ball;
			
			break;
		case 2:total_run+=run_by_ball;
		
		break;
		case 3:total_run+=run_by_ball;
		
		break;
		case 4:total_run+=run_by_ball;
		
		break;
		case 5:total_run+=run_by_ball;
		
		break;
		case 6:total_run+=run_by_ball;
		
		break;
		default:
			break;
		}
		System.out.println(total_run);
	}
}
