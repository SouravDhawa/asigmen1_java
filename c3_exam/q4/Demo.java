package Exam3.q4;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo {
    public static void main(String[] args) {
        Demo d1=new Demo();
        Customer cs=new Customer();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter user name");
        String name=sc.next();
        System.out.println("Enter user password");
        String pass=sc.next();
        System.out.println("Enter mobile number");
        String mob=sc.next();
        System.out.println("Enter email");
        String email=sc.next();
        if(d1.validation(name,pass,mob,email)){
            cs.setUsername(name);
            cs.setPassword(pass);
            cs.setMobileNumber(mob);
            cs.setEmail(email);
            System.out.println(cs.getUsername());
            System.out.println(cs.getPassword());
            System.out.println( cs.getMobileNumber());
            System.out.println(cs.getEmail());
        }

    }

    public boolean validation(String name,String pass,String mob,String email){
        if(Pattern.matches("[A-Z]{3,8}",name)){
        }else {
            System.out.println("should contain only alphabets and length should be min 3 and max 8\n" +
                    "characters.");
            return false;
        }
        if(Pattern.matches("[\\d]{3,8}",pass)){}
        else{
            System.out.println("should be alpha-numeric and also min 3 and max 8 characters.");
            return false;
        }
        if(Pattern.matches("[6789]{1}[0-9]{9}",mob)){}
        else{
            System.out.println("should be an Indian mobile number starting with 6,7,8,9 and the\n" +
                    "length should be 10.");
            return false;
        }
        if(Pattern.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$",email)){}
        else{
            System.out.println("invalid email");
            return false;
        }
        return true;
    }
}
