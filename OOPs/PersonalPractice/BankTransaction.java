package OOPs.PersonalPractice;

import java.util.Scanner;

public class BankTransaction {
    private String holderName;
    private String accountNumber;
    private String ifscCode;
    private double balance;

    public void setHolderName(String holderName,String accountNumber,String ifscCode,double balance){
        this.holderName = holderName;
        this.accountNumber = accountNumber;
        this.ifscCode = ifscCode;
        this.balance = balance;
    }

    public String getHolderName(){
        return holderName;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public String getIfscCode(){
        return ifscCode;
    }
    public double getBalance(){
        return balance;
    }
    public void display(){
        System.out.println("Name: "+holderName);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("IFSC: "+ifscCode);
        System.out.println("Balance: "+balance);
    }
    public static void main(String[] args) {
        BankTransaction bank = new BankTransaction();
        bank.setHolderName("Vivek Anand","58965847586","SBIN008596",55000);

        System.out.println("Name: "+bank.getHolderName());
        System.out.println("Account: "+bank.getAccountNumber());
        System.out.println("IFsc: "+bank.getIfscCode());
        System.out.println("Bal: "+bank.getBalance());
    }

}
