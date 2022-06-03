package Day11.q1;

public interface X {
  abstract void funA();

    default void funB() {
      System.out.println("inside the funB of X");
    }
    static void funnC(){
      System.out.println("inside the funC OF X");
    }

}
