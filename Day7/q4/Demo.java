package day7.q4;

import java.util.Scanner;

public class Demo {
    public static Bank getBank(String bank){
        if(bank.equals("axis")){
            AxisBank axis=new AxisBank();
            axis.setBranchName("axis");
            axis.setIfscCode("121313");
            axis.displayDetails();
        }else if(bank.equals("icici")){
            ICICIBank icici=new ICICIBank();
            icici.setBranchName("icici");
            icici.setIfscCode("567987");
            icici.displayDetails();
        }else{
            return null;
        }
        return null;
    }

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter bank name");
        String bank=scan.next();
        Bank m=getBank(bank);

    }
}
