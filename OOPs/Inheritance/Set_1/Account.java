package OOPs.Inheritance.Set_1;

public class Account {
    double balance = 55000.500;
    void showBalance(){
        System.out.println("Balance: "+balance);
    }
}
class SavingsAccount extends Account{
    double interestRate = 7;
    void showBalance(){
        double interest = (balance*interestRate*1)/100;
        System.out.println("Balance with interest: "+interest);
    }

    public static void main(String[] args) {
        SavingsAccount obj = new SavingsAccount();
        obj.showBalance();
    }
}
