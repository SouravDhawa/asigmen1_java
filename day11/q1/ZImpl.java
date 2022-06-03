package Day11.q1;

public class ZImpl implements Z{
    @Override
    public void funA() {
        Z.super.funA();
    }

    @Override
    public void funB() {
        Z.super.funB();
    }

    @Override
    public void funZ() {
        System.out.println("inside the funZ of zimpl");
    }
}
