package day5;

public class Bank_account_details {
   private int accountId;
    private String accountType;
    private int balance ;

    public int getAccountId(){
        return accountId;
    }
    public void setAccountId(int accountId){
        this.accountId=accountId;
    }
    public String getAccountType(){
        return accountType;
    }
    public void setAccountType(String accountType){
        this.accountType=accountType;
    }
    public int getBalance(){
        return balance;
    }
    public void setBalance(int balance){
        this.balance=balance;
    }
    public boolean withdrawAmmount(int ammount){
        if(this.getBalance()>=ammount){
            this.setBalance(this.getBalance()-ammount);
            System.out.println("Balance after withdraw: "+this.getBalance());
            return true;
        }else{
            System.out.println("Sorry!!! No enough balance");
            return false;
        }
    }
    public static void main(String[] args) {

    }
}
