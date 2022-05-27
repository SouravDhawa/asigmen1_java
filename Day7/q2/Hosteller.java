package day7.q2;

public class Hosteller extends Student {
    double hostelFee;

    public double getHostelFee() {
        return hostelFee;
    }

    public void setHostelFee(double hostelFee) {
        this.hostelFee = hostelFee;
    }

    @Override
    public double payFee(double ammount){
        double reminigAmmount=(this.getHostelFee()+this.getExamFee())-ammount;
        return Math.abs(reminigAmmount);
    }
}
