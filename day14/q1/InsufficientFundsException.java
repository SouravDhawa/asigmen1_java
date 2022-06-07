package Day14.q1;

public class InsufficientFundsException extends Exception{
    String massege;

    InsufficientFundsException(String massege){
        super(massege);
    }

}
