package day5;

import java.util.Scanner;

public class Account_details {
    public static void main(String[] args) {
        Bank_account_details a=new Bank_account_details();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter account id: ");
        a.setAccountId(scan.nextInt());

        System.out.println("Enter account type");
        a.setAccountType(scan.next());

        System.out.println("Enter balance: ");
        a.setBalance(scan.nextInt());

        System.out.println("Enter ammount to be withdraw");
        a.withdrawAmmount(scan.nextInt());
    }
}
