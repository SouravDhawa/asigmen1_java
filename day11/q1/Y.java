package Day11.q1;

public interface Y {
    abstract void funA();

    default void funB() {
        System.out.println("inside the funB of Y");
    }
    static void funnC(){
        System.out.println("inside the funC of Y");
    }
}
