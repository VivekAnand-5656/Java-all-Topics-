package OOPs.PersonalPractice;

import java.util.Scanner;

public class BankDetail {
    private String holderName;
    private String accountNumber;
    private int pin;
    public void setHolderName(String holderName,String accountNumber,int pin){
        this.holderName = holderName;
        this.accountNumber = accountNumber;
        if(pin <= 9999 || pin >= 1000){
            this.pin = pin;
        }
    }
    public String getHolderName(){
        return holderName;
    }
    public String getAccountNumber(){
        return getAccountNumber();
    }
    public int getPin(){
        return pin;
    }
    public void login(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String holName = inp.nextLine();
        inp.nextLine();

        System.out.println("Enter Account Number: ");
        String acNumber = inp.nextLine();

        System.out.println("Enter Pin: ");
        int pinNum = inp.nextInt();

        if(holName.equals(holderName)){
            if(acNumber.equals(accountNumber)){
                if(pin==pinNum){
                    System.out.println("Login Successfully.😊");
                } else {
                    System.out.println("Enter Correct PIN.❌");
                }
            }else {
                System.out.println("Enter coorect Account Number.😒");
            }
        } else {
            System.out.println("Please Enter your Correct Name!");
        }

    }
    public void show(){
        System.out.println("Name: "+holderName);
        System.out.println("Account Number: "+accountNumber);
    }

}
