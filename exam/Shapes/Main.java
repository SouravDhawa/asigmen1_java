package fast_exam.Shapes;

public class Main {
    public static void main(String[] args) {
        Shapes shapes=new Shapes();
        Circle cercle=new Circle();

        Rechtangle rechtangle=new Rechtangle();
        rechtangle.setLength(10);
        rechtangle.setBreadth(10);

        cercle.setRadius(5);

        shapes.area(cercle);
        shapes.area(rechtangle);


        Squar squar=new Squar();
        squar.setSide(5);
        shapes.area(squar);
    }
}
