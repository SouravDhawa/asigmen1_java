package Day15.assigment.q1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Age {

    void userAge(String dob) throws User_definedexception{
        LocalDate d1=LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        LocalDate l1=LocalDate.now();
        Period p=Period.between(d1,l1);
//        System.out.println(p.getYears());
if(p.getYears()<=0){
    User_definedexception us=new User_definedexception("Date should not be in Future");
    throw us;
}else{
            System.out.println(p.getYears());
}
    }
    public static void main(String[] args) {

        try {
            Age a1=new Age();
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter your date of birth");
            String dob=sc.next();
            a1.userAge(dob);
        }catch (User_definedexception us){
            System.out.println(us.getMessage());
        }
        catch (Exception e){
            System.out.println("InvalidDateFormat");
        }
    }
}
