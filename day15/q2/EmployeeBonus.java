package Day15.assigment.q2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class EmployeeBonus {
     EmployeeBonus(String date) throws InvalidAge{
        LocalDate d1=LocalDate.parse(date, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
         LocalDate l1=LocalDate.now();
        long l= ChronoUnit.MONTHS.between(d1,l1);
         System.out.println(l);
//        Period p=Period.between(d1,l1);

        if(l<=0){
            InvalidAge inv=new InvalidAge("Age should not be in the future ");
            throw inv;
        }else if(l<=12){
            System.out.println("Bonus is: "+5000);
        }else if(l<=24){
            System.out.println("Bonus is: "+8000);
        }else if( l>24){
            System.out.println("Bonus is: "+10000);
        }


    }

    public static void main(String[] args) {
        try {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter your joining date");
            String date=sc.next();
            EmployeeBonus emp=new EmployeeBonus(date);
        } catch (InvalidAge e) {
            System.out.println(e.getMessage());
        }catch (Exception el){
            System.out.println("Please pass the date in the correct format");
        }

    }
}
