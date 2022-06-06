package Exam3.q1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter the number of elements in the array");
            int size=sc.nextInt();
            int []arr=new int[size];
            System.out.println("Enter the elements in the array");
            for(int i=0;i<size;i++){
                arr[i]= sc.nextInt();
            }
            System.out.println("Enter the index of the array element you want to access");
            int ind=sc.nextInt();
            System.out.println("The array element at index"+ind+" = "+arr[ind]);
            System.out.println("The array element successfully accessed");
        }catch (ArrayIndexOutOfBoundsException aib){
            System.out.println("java.lang.ArrayIndexOutOfBoundsException");
        }catch (InputMismatchException inp){
            System.out.println("java.lang.NumberFormatException");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
