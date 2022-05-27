package day7.q4;

public class AxisBank extends Bank{
    double rateOfInterest=9;
    void getCreditCard(){
        System.out.println("Get the Credit Card from the Axis bank");
    }
@Override
    void displayDetails(){

        System.out.println("Bank is: "+branchName);
        System.out.println("ifsc code is: "+IfscCode);
        System.out.println("rateOfInterest: "+rateOfInterest);
        getCreditCard();
    }
}
