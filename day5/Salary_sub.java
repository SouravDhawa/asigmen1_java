package day5;

import java.util.Scanner;

public class Salary_sub {
    public static void main(String[] args) {
        Salary s1=new Salary();
        Scanner inp=new Scanner(System.in);
        System.out.println("enter name");
        s1.setEmployeeName(inp.nextLine());
        System.out.println("enter id");
        s1.setEmployeeId(inp.nextInt());

        System.out.println("enter salary");
        s1.setSalary(inp.nextDouble());
        System.out.println("enter pf percentage");
        int pf=inp.nextInt();
        s1.getEmployeeDetails();
        s1.getPFPercentage(pf);
    }
}
