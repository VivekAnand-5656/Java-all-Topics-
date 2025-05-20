package OOPs.Inheritance.Set_1;

public class BankAccount {
    double intialBalance = 5000;
    void displayBalance(){
        System.out.println("Initial Balance: "+intialBalance);
    }
}
class SavingsAccounts extends BankAccount{
    double add = 2000;
    void deposit(){
        double depo = add + intialBalance;
        System.out.println("Deposited: "+add);
        System.out.println("New Balance: "+depo);
    }

    public static void main(String[] args) {
        SavingsAccounts obj = new SavingsAccounts();
        obj.displayBalance();
        obj.deposit();
    }
}
