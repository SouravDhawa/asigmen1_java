package day5;

import java.util.Scanner;

public class Salary {
    int employeeId;
    String employeeName;
    double salary;
    double netSalary;

    public static void main(String[] args) {
        Salary s1=new Salary();
        Scanner inp=new Scanner(System.in);
        System.out.println("enter name");
        s1.employeeName=inp.nextLine();
        System.out.println("enter id");
        s1.employeeId= inp.nextInt();

        System.out.println("enter salary");
        s1.salary=inp.nextDouble();
        System.out.println("enter pf percentage");
        int pf=inp.nextInt();

        System.out.println("id: "+s1.employeeId);
        System.out.println("Name: "+s1.employeeName);
        System.out.println("Sallary: "+s1.salary);
        s1.netSalary=((s1.salary/100)*pf);

        System.out.println("Net Salary: "+(s1.salary-s1.netSalary));

    }
}
