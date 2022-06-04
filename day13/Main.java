package day13.Assigment;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try{
            System.out.println("start of main..");
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter num1");
            int num1 = sc.nextInt();
            System.out.println("Enter num2");
            int num2 = sc.nextInt();
            String message = null;
            An a1=null;
            int num3 = num1 / num2;
            if(num3 > 10)

                a1=new An();
                a1.funa();

                message = "Welcome to Exception Handling ";
                System.out.println("Message is :"+message.toUpperCase());

        }catch (ArithmeticException ar){
//            System.out.println("e"+ar.getMessage());
            System.out.println("num2 should not be 0");

        }
//        catch (NumberFormatException nfe){
//            System.out.println("nfe");
//
//        }
        catch (NullPointerException nlp){
            System.out.println("String value is null");
        }catch (Exception e){
            System.out.println("Please enter valid number");
        }
        System.out.println("end of main");

    }
}
