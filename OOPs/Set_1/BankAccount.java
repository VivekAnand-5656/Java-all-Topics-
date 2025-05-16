package OOPs.Set_1;

import java.util.Scanner;

public class BankAccount {
    public String accountHolderName;
    public String accounNumber;
    public double balance;
    public double totalAmount;
    public double deduct;
    public void deposit(double amount){
        if(amount>0){
            totalAmount = balance+amount;
            System.out.println(amount + " Deposit Successful.");
        } else{
            System.out.println("Failed Deposit!");
        }
    }
    public void withdraw(double amount){
        deduct = totalAmount-amount;
        if(amount <= totalAmount){
            System.out.println("Withdrawl Succesful.");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }
    public void displayBalance(){
        System.out.println("Current Balance: "+deduct);
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        BankAccount bank = new BankAccount();
        System.out.println("Enter Holder Name: ");
        bank.accountHolderName = inp.nextLine();
        System.out.println("Enter Account Number: ");
        bank.accounNumber = inp.nextLine();
        System.out.println("Enter Balance: ");
        bank.balance = inp.nextDouble();
        System.out.println("Enter Deposit Amount: ");
        double amount = inp.nextDouble();
        bank.deposit(amount);
        System.out.println("Enter Withdraw Amount: ");
        double widthdrawAmount = inp.nextDouble();
        bank.withdraw(widthdrawAmount);
        bank.displayBalance();
    }
}
