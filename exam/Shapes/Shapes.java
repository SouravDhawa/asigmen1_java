package fast_exam.Shapes;

public class Shapes {
    public void area(Circle cercle){
    double res=3.14*cercle.getRadius()*cercle.getRadius();
        System.out.println("The area of a cercle is: "+res);
    }
    public void area(Rechtangle rechtangle){
        double res=rechtangle.getLength()*rechtangle.getBreadth();
        System.out.println("Rechtengle is: "+res);
    }
    public void area(Squar squar){
        int res=squar.getSide()*squar.getSide();
        System.out.println("squar of a number"+res);
    }
}
