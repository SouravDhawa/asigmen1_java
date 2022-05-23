package fast_exam;

public class Engine {
    static int rmp;
    static int power;
    static String manufacturer;
    static boolean hastubo;

    static void enevelturbo(boolean turbo){
        if(turbo){
            Engine.hastubo=true;
        }else{
            Engine.hastubo=false;
        }
    }
}
