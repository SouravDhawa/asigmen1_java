package day7.q4;

public class ICICIBank extends Bank{
    double rateOfInterest=8;




    @Override
    void displayDetails(){

        System.out.println("Bank is: "+branchName);
        System.out.println("ifsc code is: "+IfscCode);
        System.out.println("rateOfInterest: "+rateOfInterest);
    }

}
