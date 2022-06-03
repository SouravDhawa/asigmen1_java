package Day11.q1;

public interface Z extends X,Y{
    @Override
    default void funA() {
        System.out.println("inside the funA of Z");
    }

    @Override
    default void funB() {
        X.super.funB();
    }
    void funZ();
}
