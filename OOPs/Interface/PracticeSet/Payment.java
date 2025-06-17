package OOPs.Interface.PracticeSet;

public interface Payment {
    void processPayment();
}
class CreditCardPayment implements Payment{
    public void processPayment(){
        System.out.println("Payment through Credit Card");
    }
}
class UpiPayment implements Payment{
    public void processPayment(){
        System.out.println("Payment through UPI..");
    }

    public static void main(String[] args) {
        Payment payment1 = new CreditCardPayment();
        Payment payment2 = new UpiPayment();
        payment1.processPayment();
        payment2.processPayment();
    }
}
