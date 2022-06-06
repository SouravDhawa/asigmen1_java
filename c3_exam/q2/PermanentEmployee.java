package Exam3.q2;

public class PermanentEmployee extends Employee{
   private double basicPay =4000.00;
    @Override
    void calculateSalary() {
        double pfammount=0.02;
        double salary=basicPay-pfammount;
        double sal=setSalary(salary);

        System.out.println(sal);
    }

//    int employid=getEmployeeId();
//    String employeeName=getEmployeeName();
   public void PermanentEmployee(int employid,String employeeName,double basicPay){
       System.out.println(employid);
       System.out.println(employeeName);
       System.out.println(basicPay);
    }
}
