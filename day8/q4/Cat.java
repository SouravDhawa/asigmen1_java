package Day8.q4;

public class Cat extends Animal{
    @Override
    public void makeNoise(){
        System.out.println("Mew...");
    }
    public void eat(){
        System.out.println("Animal is eating");
    }
    public void walk(){
        System.out.println("Animal is walking");
    }
}
