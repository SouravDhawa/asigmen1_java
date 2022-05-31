package Day10.p1;

public  class A {
    int a=10;
//    public abstract void funB();
    public void funa(){
        System.out.println("inside the fun a");
    }
    private A(){

    }

    public static A getAobject(){
        A a1=new A();
        return a1;
    }
}
