package day7.q3;

public class Dog extends Cat{
    @Override
    void eat(){
        System.out.println("dog can eat");
    }

    void display(){
        super.eat();
        System.out.println("display");
    }

    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.display();
    }
    //the super keyword refersw to super class parent object.it used to call superclass method
    //and to access super class constructor
}
