package day7.q3;

public class Super_this {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    void display(){
        System.out.println(this.getName());
    }

    //this keyword refers to the curren object in a method or constructor.the most common
    //use of the this keyword is to eliminatae the confusion between class attributes
    //and parameter with the same name.
    public static void main(String[] args) {
        Super_this s1=new Super_this();
        s1.setName("sourav");
        s1.display();
    }
}
