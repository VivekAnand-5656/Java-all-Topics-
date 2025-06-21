package ExceptionHandling.ClassTestWork;

import OOPs.Overloading.Sets.Bank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InsufficientFundsException extends Exception{
    public InsufficientFundsException (String msg){
        super(msg);
    }
}
class BankAccount {
    public double balance;
    public BankAccount(double balance){
        this.balance = balance;
    }
    public void withdraw(double amount) throws InsufficientFundsException{
        if(amount > balance){
            throw new InsufficientFundsException("Insufficient amount");
        } else {
            balance-=amount;
            System.out.println("Available balance: "+balance);
        }
    }
    public static void main(String[] args) throws InsufficientFundsException{
        Scanner inp = new Scanner(System.in);
        BankAccount obj = new BankAccount(55000);
        try {
            System.out.println("Enter amount");
            double amount = inp.nextDouble();
            obj.withdraw(amount);
        } catch (InsufficientFundsException ch){
            System.out.println(ch.getMessage());
        } catch (InputMismatchException ch){
            System.out.println("Inavlid input");
        }
    }
}
