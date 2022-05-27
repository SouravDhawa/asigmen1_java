package Day8.q3;

import Day8.q1.Bird;

public class Boy extends Girl{
    @Override
    void look(){
        System.out.println("looks cool");
    }
    void display(){
        System.out.println("display");
    }

    public static void main(String[] args) {
        Girl g1=new Boy();
        g1.look();
       Boy b1=(Boy)g1;
       b1.display();
    }
/*
*
* * Q3) Explain dynamic polymorphism ?
 *
 * Ans :
 *
 * 	In this form of polymorphism in java, the compiler doesn’t determine
 * the method to be executed. It’s the Java Virtual Machine (JVM) that performs
 * the process at the run time. Dynamic polymorphism refers to the process when
 * a call to an overridden process is resolved at the run time. The reference
 * variable of a superclass calls the overridden method.
 * The methods that are implemented by both the subclass and the superclass provide
 * different functionality while sharing the same name.*/
}
