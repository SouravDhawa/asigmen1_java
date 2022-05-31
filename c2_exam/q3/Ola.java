package Exam2.q3;

public class Ola {

    public Car bookCar(int numberOfPassenger, int numberOfKMs){
        if(numberOfKMs<=3){
            HatchBack h1=new HatchBack();
           h1.setNumberOfKms(numberOfKMs);
           h1.setNumberOfPassenger(numberOfPassenger);

            return h1;
        }else{

            Sedan s1=new Sedan();
            s1.setNumberOfKms(numberOfKMs);
            s1.setNumberOfPassenger(numberOfPassenger);
        return s1;
        }
    }
    public int calculateBill(Car car){
        if(car instanceof Sedan){
            Sedan mysea=(Sedan) car;
            int total=mysea.getNumberOfKms()*mysea.farePerKm;
            return total;
        }else {
            HatchBack myhac=(HatchBack) car;
            int total=myhac.getNumberOfKms()*myhac.farePerKm;
            return total;
        }

    }


}
