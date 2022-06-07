package Day14.q2;

public class InvalidCountryException extends Exception{
    String masage;
    InvalidCountryException(String masage){
        super(masage);
    }
}
