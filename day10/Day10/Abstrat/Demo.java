package Day10.Abstrat;

 class Demo extends A{
//    public Demo() {
//        super();
//        System.out.println("Inside the constructor");
//    }


    @Override
    public void funB() {
        System.out.println("inside the funB");
    }
    @Override
    public void funa(){
        System.out.println("inside the fun a");
    }

    @Override
    public void fun1() {
        System.out.println("inside the fun 1");
    }
    public void fun3(){
        System.out.println("inside the fun 3");
    }

    public static void main(String[] args) {
        A d1=new Demo();
       ((Demo)d1).fun3();
    }
}
