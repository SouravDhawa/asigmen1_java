package Exam2.q4;

import Day10.p1.A;

public class Main {
    public static Person generatePerson(Person person){
        if(person instanceof Student){
            Student mystu=(Student)person;
            mystu.setStudentId(123);
            mystu.setName("sourav");
            mystu.setGender("male");
            mystu.setCourseEnrolled("JA111");
            mystu.setCourseFee(30000);
            Address myaddres=new Address();
            myaddres.setCity("kolkat");
            myaddres.setPinCode("7778");
            myaddres.setState("west");
           mystu.setMyadress(myaddres);

            return mystu;
        }else{
            Instructor myins=(Instructor)person;
            myins.setInstructorId(333);
            myins.setSalary(120000);
            myins.setName("mam");
            myins.setGender("female");
            Address myaddres=new Address();
            myaddres.setCity("kolkat");
            myaddres.setPinCode("7778");
            myaddres.setState("west");
            myins.setMyadress(myaddres);
            return myins;
        }

    }

    public static void main(String[] args) {
        Person newStudent = generatePerson(new Student());

        Person newInstructor = generatePerson(new Instructor());

        System.out.println(newStudent);
        System.out.println(newInstructor);
    }
}
