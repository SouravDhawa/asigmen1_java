package day7.q1;

public class Employee extends Member{
    String Specialisation;
    String Department;

    public String getSpecialisation() {
        return Specialisation;
    }

    public void setSpecialisation(String specialisation) {
        Specialisation = specialisation;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }
    @Override
    void printSalary(){
        System.out.println("Salary"+Salary);
    }
    void printDetails(){
        System.out.println("Employee name: "+Name);
        System.out.println("Employee age: "+Age);
        System.out.println("Employee phnum: "+Phone_number);
        System.out.println("Employee address: "+Address);
        System.out.println("Employee Specialisation"+Specialisation);
        System.out.println("Employee Department"+Department);
    }
}
