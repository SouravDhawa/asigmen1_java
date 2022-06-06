package Exam3.q2;

public class TemporaryEmployee extends Employee{
 private   int hoursWorked=400;
  private int hourlyWages=200;

 @Override
 void calculateSalary() {
double sal=setSalary(hourlyWages*hoursWorked);
  System.out.println(sal);
 }
 public void TemporaryEmployee(int employid,String employeeName,int hoursWorked,int hourlyWages){
  System.out.println(employid);
  System.out.println(employeeName);
  System.out.println(this.hourlyWages);
  System.out.println(this.hoursWorked);
 }

 public static void main(String[] args) {
  Employee t1=new TemporaryEmployee();
   t1.setEmployeeName("sourav");
  t1.setEmployeeId(123);
  TemporaryEmployee t2=new TemporaryEmployee();
  t2.TemporaryEmployee(t1.getEmployeeId(), t1.getEmployeeName(),t2.hoursWorked,t2.hourlyWages);
  t2.calculateSalary();
 }
}
