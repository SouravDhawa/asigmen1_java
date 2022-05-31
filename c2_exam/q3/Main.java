package Exam2.q3;

public class Main {
    public static void main(String[] args) {
        Ola myola=new Ola();
        Car myCar = myola.bookCar(7,3);
        int res = myola.calculateBill(myCar);

        System.out.println("The total fare amount is: "+ res);
    }
}
