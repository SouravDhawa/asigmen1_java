package fast_exam;

public class Car {
    private static Engine Engine;

    String model;
    String companyname;
    String colour;
    Engine engine;

    public Car(){
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model=model;
    }
    public String getcompanyname(){
        return companyname;
    }
    public void setcompanyname(String companyname){
        this.companyname=companyname;
    }
    public String getcolour(){
        return colour;
    }
    public void setcolour(String colour){
        this.colour=colour;
    }
    public Engine getEngine(){
        return engine;
    }
    public void setEngine(Engine engine){
        this.engine=engine;
    }
    public Car(String model,String companyname,String colour,Engine engine){
        this.model=model;
        this.companyname=companyname;
        this.colour=colour;
        this.engine=engine;
    }

    public static void main(String[] args) {
        Car c= new Car("hariar","tata","black",Engine);
        c.setModel("nexon");
        c.setcompanyname("tata");
        c.setcolour("black");
        c.engine.manufacturer="tata";
        c.engine.power=112;
        c.engine.rmp=10000;
        c.engine.hastubo=true;
        System.out.println("car model"+c.model);
        System.out.println(c.companyname);
        System.out.println(c.colour);
        System.out.println(Engine.rmp);
        System.out.println(Engine.manufacturer);
        System.out.println(Engine.hastubo);

        System.out.println("-------------------");
        Car c1= new Car();
       Engine.manufacturer="tata";
        Engine.power=112;
        Engine.rmp=10000;
        Engine.hastubo=true;
        System.out.println(c1.model);
        System.out.println(c1.companyname);
        System.out.println(c1.colour);
        System.out.println(Engine.rmp);
        System.out.println( Engine.power);
        System.out.println(Engine.hastubo);
    }
}

