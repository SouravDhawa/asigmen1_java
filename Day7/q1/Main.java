package day7.q1;

public class Main {
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.setName("sourav");
        e1.setAge(24);
        e1.setPhone_number("91236633125");
        e1.setSalary(50000);
        e1.setAddress("balighai");
        e1.printDetails();
        e1.printSalary();

        Manager m1=new Manager();
        m1.setName("sourav");
        m1.setAge(24);
        m1.setPhone_number("91236633125");
        m1.setSalary(50000);
        m1.setAddress("balighai");
        m1.printDetails();
        m1.printSalary();
    }


}
