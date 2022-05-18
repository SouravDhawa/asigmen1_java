package assigment2;

public class check_wether {
	boolean isSnowing = false;
	boolean isRaining = true;
	double temperature = 60.0;
	 void wether(boolean isSnowing,boolean isRaining,double temperature) {
		 String result = isSnowing | isRaining |temperature>50? "Let’s stay home.":"Let’s go out!";
		 
		 System.out.println(result);
	 }
		
		public static void main(String[] args) {

		//Assume these can have any value:
			//boolean isSnowing = false;
			//boolean isRaining = true;
			//double temperature = 60.0;
		//print "Let’s stay home." if its raining, snowing or
		//below 50 degrees and print "Let’s go out!" otherwise.
			check_wether cw =new check_wether();
			
			cw.wether(cw.isSnowing,cw.isRaining,cw.temperature);
			

}
}