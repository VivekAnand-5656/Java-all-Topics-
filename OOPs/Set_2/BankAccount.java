package OOPs.Set_2;

public class BankAccount {
    private String accountHolderName;
    private String accountNumber;
    private double balance;
    public void setAccountHolderName(String accountHolderName,String accountNumber, double balance){
        this.accountHolderName=accountHolderName;
        this.accountNumber=accountNumber;
        this.balance=balance;
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
        if(amount>0){
            balance+=amount;
            System.out.println("Deposit: "+amount+" Available Balance: "+balance);
        }else {
            System.out.println("Try Again!");
        }

    }
    public void withdraw(double amount){
        if(balance>=amount && amount>0){
            balance-=amount;
            System.out.println("Withdraw Successful: "+amount+" Available Balance: "+balance);
        }else{
            System.out.println("Insufficient Balance!");
        }
    }
    public void displayAccountInfo(){
        System.out.println("Name:" +getAccountHolderName());
        System.out.println("Account Number:" +getAccountNumber());
        System.out.println("Balance: "+getBalance());
    }

    public static void main(String[] args) {
        BankAccount det = new BankAccount();
        det.setAccountHolderName("Vivek Anand","7485963685225",25000);
        det.deposit(5000);
        det.withdraw(1000);
        det.displayAccountInfo();
    }
}