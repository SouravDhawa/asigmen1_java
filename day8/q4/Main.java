package Day8.q4;

public class Main {
    public static void main(String[] args) {
        Animal [] animals =new Animal[3];
        animals[0]=new Dog();
        animals[1]=new Cat();
        animals[2]=new Tiger();

        for(Animal animal:animals){
            animal.makeNoise();
            animal.eat();
            animal.walk();
            System.out.println("=====================");
        }
    }
}
