package day5;

import java.util.Scanner;

public class Salary {
    int employeeId;
    String employeeName;
    double salary;
    double netSalary;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getNetSalary() {
        return netSalary;
    }

    public void setNetSalary(double netSalary) {
        this.netSalary = netSalary;
    }
    public void getPFPercentage(int pf){
         double res=(this.salary/100)*pf;
        System.out.println(res);
    }
    public void getEmployeeDetails(){
        System.out.println(this.employeeId);
        System.out.println(this.employeeName);
        System.out.println(this.salary);
    }

}
