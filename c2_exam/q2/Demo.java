package Exam2.q2;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Demo d=new Demo();
        Student s=new Student();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of student");
        int num=sc.nextInt();
        Student []student=new Student[num];
        for(int i=0;i<num;i++){
            student[i]=new Student();
            System.out.println("roll");
            student[i].setRoll(sc.nextInt());
            System.out.println("name");
            student[i].setName(sc.next());
            System.out.println("Address");
            student[i].setName(sc.next());
            System.out.println("marks");
            student[i].setMarks(sc.nextInt());

        }
        for(int i=0;i<num;i++){
            System.out.println("student"+i+1);
            System.out.println("roll"+student[i].getRoll());
            System.out.println("Name"+student[i].getName());
            System.out.println("address"+student[i].getAddress());
            System.out.println("=================================");
        }
    double avr=s.getavr(student,num);
            System.out.println(avr);

    }
}
