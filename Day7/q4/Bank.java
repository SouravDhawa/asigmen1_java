package day7.q4;

public class Bank {
    String branchName;
    String IfscCode;

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getIfscCode() {
        return IfscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.IfscCode = ifscCode;
    }

    void displayDetails(){
        System.out.println("Bank is: "+branchName);
        System.out.println("ifsc code is: "+IfscCode);
    }

}
