package OOPs.PracticeSessionDay;

import java.util.Scanner;

public class Atm {
    protected String accountHolder;
    protected double balance;
    protected long password;
    public  void input(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter name: ");
        accountHolder = inp.nextLine();
        System.out.println("Enter amount: ");
        balance = inp.nextDouble();
        System.out.println("Enter password: ");
        password = inp.nextLong();
    }

    public void deposit(double amount){

        if(amount!=0){
            balance+=amount;
            System.out.println(amount + " Deposited.");
        } else {
            System.out.println("Enter correct amount.");
        }
    }
    public void withdraw(double amount,long pass){
        if(amount <= balance && amount!=0){
           if(password == pass){
               balance-=amount;
               System.out.println(amount + " Withdraw Successfully. Current Balance: "+balance);
           } else {
               System.out.println("Wrong Password! Try again.");
           }
        }
        else {
            System.out.println("Insufficient Balance!");
        }
    }
    public void detail(){
        System.out.println("Name: "+accountHolder+" Total Balance: "+balance);
    }

    public static void main(String[] args) {
        Atm data = new Atm();
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter Deposit Ammount: ");
        double depAmount = inp.nextDouble();

        System.out.println("Enter Withdraw amount: ");
        double withdrawAmount = inp.nextDouble();
        System.out.println("Enter PIN: ");
        long pin = inp.nextLong();
        data.input();
        data.deposit(depAmount);
        data.withdraw(withdrawAmount,pin);
        data.detail();
    }
}
