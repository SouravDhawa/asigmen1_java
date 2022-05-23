package fast_exam;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Student_details s2=new Student_details(12,"sourav",45);
        Scanner sc=new Scanner(System.in);
        System.out.println("enter roll number");
        s2.setMarks(sc.nextInt());
        System.out.println("enter name");
        s2.setStudentName(sc.next());
        System.out.println("enter marks");
        s2.setMarks(sc.nextInt());
        s2.student();
    }
}
