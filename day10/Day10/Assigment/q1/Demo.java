package Day10.Assigment.q1;

public class Demo {
    public Hotel provideFood(int amount){
            if(amount>1000){
                Hotel h1=new TajHotel();
                h1.chickenBiryani();
                h1.masalaDosa();
                TajHotel t1=new TajHotel();
                t1.welcomeDrink();
                return h1;
            }else if(amount>200 && amount<1000){
                Hotel h2=new RoadSideHotel();
                h2.masalaDosa();
                h2.chickenBiryani();
                return h2;
            }else{
                return null;
            }

    }

    public static void main(String[] args) {
        Demo d1=new Demo();
        d1.provideFood(4000);

    }

}
