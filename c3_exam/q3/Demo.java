package Exam3.q3;

import java.util.Scanner;

public class Demo {
    void showDetails(Month m){
        if(m==Month.JAN){
            System.out.println("This is the 1st Month of the Year January");
        }else if(m==Month.FEB){
            System.out.println("This is the 2nd Month of the Year February");
        }else if(m==Month.MAR){
            System.out.println("This is the 3rd Month of the Year March");
        }else if(m==Month.APR){
            System.out.println("This is the 4TH Month of the Year April");
        }else if(m==Month.MAY){
            System.out.println("This is the 5TH Month of the Year May");
        }else if(m==Month.JUN){
            System.out.println("This is the 6TH Month of the Year jun");
        }else if(m==Month.JUL){
            System.out.println("This is the 7TH Month of the Year JULAY");
        }else if(m==Month.AUG){
            System.out.println("This is the 8TH Month of the Year Agoust");
        }else if(m==Month.SEP){
            System.out.println("This is the 9TH Month of the Year September");
        }else if(m==Month.OCT){
            System.out.println("This is the 10TH Month of the Year October");
        }else if(m==Month.NOV){
            System.out.println("This is the 11TH Month of the Year November");
        }else if(m==Month.DEC){
            System.out.println("This is the 12TH Month of the Year December");
        }
    }

    public static void main(String[] args) {
        Demo d1=new Demo();

        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the MONTH");
            String res=sc.next();
            Month m =Month.valueOf(res);
            d1.showDetails(m);
        }catch (Exception e){
            System.out.println("Entter the valid month");
        }
    }

}
