package OOPs.Encapsulation.PracticeSet;

import java.util.Scanner;

public class BankAccount {
    private String accountHolderName;
    private String accountNumber;
    private double balance;
    public void setAccountHolderName(String accountHolderName,String accountNumber,double balance){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public String getAccountHolderName(){
        return accountHolderName;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        if(amount > 0){
            balance+=amount;
            System.out.println(amount + " Deposited");
        } else {
            System.out.println("Deposite Failed");
        }
    }
    public void withdraw(double amount){
        if(amount <= balance && amount > 0){
            balance-=amount;
            System.out.println(amount + " Withdraw Successfully");
        } else {
            System.out.println("Insufficient Balance");
        }
    }
    public void detailShow(){
        System.out.println(getAccountHolderName());
        System.out.println(getAccountNumber());
        System.out.println(getBalance());
    }

    public static void main(String[] args) {
        BankAccount bank = new BankAccount();
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = inp.nextLine();
        inp.nextLine();
        System.out.println("Enter Account Number: ");
        String accountNum = inp.nextLine();
        System.out.println("Enter Balance: ");
        double balance = inp.nextDouble();
        bank.setAccountHolderName(name,accountNum,balance);

        System.out.println("Enter Dposit amount: ");
        double deposit = inp.nextDouble();
        bank.deposit(deposit);

        System.out.println("Enter Withdraw amount: ");
        double withdraw = inp.nextDouble();
        bank.withdraw(withdraw);

        bank.detailShow();
    }
}
