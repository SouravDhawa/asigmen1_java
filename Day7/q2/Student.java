package day7.q2;

public class Student {
    int studId;
    String studName;
    double examFee;

    public int getStudId() {
        return studId;
    }

    public void setStudId(int studId) {
        this.studId = studId;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public double getExamFee() {
        return examFee;
    }

    public void setExamFee(double examFee) {
        this.examFee = examFee;
    }
   public void displayDetails(){
        System.out.println("studId: "+this.getStudId());
        System.out.println("studName: "+this.getStudName());
        System.out.println("examFee: "+this.getExamFee());
    }
   public double payFee(double ammount){
        double reminigAmmount=this.getExamFee()-ammount;
        return Math.abs(reminigAmmount);
    }
}
