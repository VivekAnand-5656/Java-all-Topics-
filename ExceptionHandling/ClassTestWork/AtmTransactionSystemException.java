package ExceptionHandling.ClassTestWork;

import com.sun.jdi.event.ExceptionEvent;
import com.sun.security.jgss.GSSUtil;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AtmTransactionSystemException extends Exception{
    public AtmTransactionSystemException(String msg){
        super(msg);
    }
}
class InsufficientException extends Exception{
    public InsufficientException(String msg){
        super(msg);
    }
}
class InvalidAmmount extends Exception{
    public InvalidAmmount(String msg){
        super(msg);
    }
}
class AtmVerification{
    private double balance;
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
//    ---- Deposit ----
    public void deposit() throws InvalidAmmount,InputMismatchException{
        Scanner inp = new Scanner(System.in);
        try {
            System.out.println("Enter Deposit Ammount");
            double depoAmount = inp.nextDouble();
            if(depoAmount<=0){
                throw new InvalidAmmount("Invalid Amount");
            } else {
                balance+=depoAmount;
                System.out.println(depoAmount+" Deposited Successfully");
            }
        } catch (InputMismatchException ch){
            throw new InvalidAmmount("Input must be Number.");
        }

    }
//    ------ Withdraw -------
    public void witdraw() throws  InputMismatchException,InsufficientException{
        Scanner inp = new Scanner(System.in);
        try {
            System.out.println("Enter Withdraw Ammount");
            double withdAmount = inp.nextDouble();
            if(withdAmount > balance){
                throw new InsufficientException("Insufficient Balance");
            } else {
                balance-=withdAmount;
                System.out.println(withdAmount + " Withdraw successfully");
            }
        } catch (InputMismatchException ch){
            throw new InsufficientException("Input must be Number");
        }

    }
//    ----- Balance Check ----
    public void checkBalance(){
        System.out.println("Current Balance: "+balance);
    }

    public static void main(String[] args) {
        AtmVerification atm = new AtmVerification();
        Scanner inp = new Scanner(System.in);
        try {
            System.out.println("Enter Ammount");
            double amount = inp.nextDouble();
            if(amount<0){
                throw new AtmTransactionSystemException("Initial amount does not exixt negative");
            }
            atm.setBalance(amount);
            atm.deposit();
            atm.witdraw();
            atm.checkBalance();
        } catch (InputMismatchException ch) {
            System.out.println("Invalid Input");
        } catch (InvalidAmmount ch) {
            System.out.println("Deposit Error: " + ch.getMessage());
        } catch (InsufficientException ch) {
            System.out.println("Withdraw Error: " + ch.getMessage());
        } catch (AtmTransactionSystemException ch) {
            System.out.println("ATM Error: " + ch.getMessage());
        }
    }
}
