package OOPs.Abstraction.Practice_Set;

abstract class Bank {
    public double rate;
    public int time;
    abstract void getInterestRate(double rate,int time);
}
class SBI extends Bank{
    public double rate;
    public int time;
    public void getInterestRate(double rate,int time){
        this.rate=rate;
        this.time = time;
        double amount = 55000;
        double si =(amount*rate*time)/100;
        System.out.println("SBI Interest Rate: "+si+ " of "+time+" year");

    }
}
class HDFC extends Bank{
    public double rate;
    public int time;
    public void getInterestRate(double rate,int time){
        this.rate = rate;
        this.time = time;
        double amount = 60000;
        double si = (amount*rate*time)/100;
        System.out.println("HDFC Interest Rate: "+si+ " of "+time+" year");
    }

    public static void main(String[] args) {
        SBI ac = new SBI();
        ac.getInterestRate(3.30,2);
        HDFC hc = new HDFC();
        hc.getInterestRate(4.00,3);
    }
}