package Exam2.q3;

public class Ola {

    public Car bookCar(int numberOfPassenger, int numberOfKMs){
            if(numberOfPassenger<=3){
                HatchBack h1=new HatchBack();
               double res=h1.farePerKm*numberOfKMs;
                System.out.println(res);


            }else{
                Sedan s1=new Sedan();
                System.out.println(s1.farePerKm*numberOfKMs);
            }

        return null;
    }
//    public Car calculateBill(Car car){
//
//
//    }

    public static void main(String[] args) {
        Ola myola=new Ola();
        Car myCar = myola.bookCar(7,3);
//        int res = myola.calculateBill(myCar);

//        System.out.println("The total fare amount is"+ res);
    }

}
