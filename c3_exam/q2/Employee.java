package Exam3.q2;

public abstract class Employee {
   int employeeId;
    String employeeName;
    double salary;

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

    public double setSalary(double salary) {
        this.salary = salary;
        return salary;
    }
    public void employeeId(int employeeId){
        System.out.println(employeeId);
    }
    public void employeeName(String employeeName){
        System.out.println(employeeName);
    }
abstract void calculateSalary();


}
