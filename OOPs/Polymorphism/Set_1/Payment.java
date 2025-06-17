package OOPs.Polymorphism.Set_1;

public class Payment {
    public void pay(){
        System.out.println("Payment Types...");
    }
}
class CreditCardPay extends Payment{
    public void pay(){
        System.out.println("Pay through Credit Card...");
    }
}
class PayPalPay extends Payment{
    public void pay(){
        System.out.println("Pay through PayPal..");
    }

    public static void main(String[] args) {
        CreditCardPay cp = new CreditCardPay();
        cp.pay();
        PayPalPay pp = new PayPalPay();
        pp.pay();
    }
}
