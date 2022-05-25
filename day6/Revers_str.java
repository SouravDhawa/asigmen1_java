package day6.Assigment_day6;

import java.util.Scanner;

public class Revers_str {
    public static String reversString(String input){
//write the logic
        char[] arr=input.toCharArray();
        String bag="";
    for(int i=arr.length-1;0<=i;i--){
        bag=bag+arr[i];
    }
        return bag;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String to reverse");
        String orignalString = sc.next();
        String result = reversString(orignalString);
        System.out.println("Original String is :"+ orignalString);
        System.out.println("Reversed String is :"+ result);

    }
}
