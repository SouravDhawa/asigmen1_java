package day7.q2;

public class DayScholar extends Student {
    double transportFee;

    public double getTransportFee() {
        return transportFee;
    }

    public void setTransportFee(double transportFee) {
        this.transportFee = transportFee;
    }

    @Override
    public double payFee(double ammount){
        double reminigAmmount=(this.getTransportFee()+this.getExamFee())-ammount;
        return Math.abs(reminigAmmount);
    }
}
