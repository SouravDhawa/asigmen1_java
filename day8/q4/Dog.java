package Day8.q4;

public class Dog extends Animal{
    @Override
    public void makeNoise(){
        System.out.println("Barking...");
    }
    public void eat(){
        System.out.println("Animal is eating");
    }
    public void walk(){
        System.out.println("Animal is walking");
    }
}
