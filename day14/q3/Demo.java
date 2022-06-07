package Day14.q3;

public class Demo {
    /*
    * In this class the final keyword is non acessable key word its makes final keyword or non changble
    * key word its used attributes and methods also which makes them non-changeable (impossible to inherit or override).
    * In Java, the final keyword is used to denote constants. It can be used with variables, methods, and classes.
    *  Once any entity (variable, method or class) is declared final , it can be assigned only once.*/
    public static void main(String[] args) {
        Final d1=new Final();
//        d1.name="dhawa";  this is rhrowing error
    }

}
class Final extends Demo{
   final String name="Sourav";

}

class Finally extends Demo{
    /*The finally block is always executed whether an exception is handled or not. Therefore,
it contains all the necessary statements that need to be executed regardless of the
exception occurs or not.

finally block in Java can be used to put "cleanup" code such as closing a file,
closing connection, etc.

The important statements to be printed can be placed in the finally block
*/
    public static void main(String[] args) {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[5]);
        } catch (Exception e) {
            System.out.println("Something  wrong.");
        } finally {
            System.out.println("Inside the finally method");
        }
    }
}
