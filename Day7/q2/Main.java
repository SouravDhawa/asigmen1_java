package day7.q2;

public class Main {
    public static void main(String[] args) {
        Hosteller h1=new Hosteller();


        h1.setStudId(123);
        h1.setStudName("sourav");
        h1.setExamFee(1000);
        h1.setHostelFee(1200);
        h1.displayDetails();
        System.out.println("pay after reming ammount: "+h1.payFee(10000));

        DayScholar d1=new DayScholar();
        d1.setStudId(123);
        d1.setStudName("dhawa");
        d1.setExamFee(1000);
        d1.setTransportFee(1200);
        d1.displayDetails();
        System.out.println("pay after reming ammount: "+d1.payFee(10000));
    }
}
