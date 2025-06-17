package OOPs.Encapsulation;

public class BankAccount {
    private String userName;
    private long accountId;
    private double balance;
    public void setUserName(String userName,long accountId,double balance){
        this.userName = userName;
        this.accountId = accountId;
        this.balance = balance;
    }
    public String getUserName(){
           return userName;
    }
    public long getAccountId(){
        return accountId;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        if(amount <= 0){
            System.out.println("Incorrect amount");
        } else {
            balance+=amount;
            System.out.println(amount + " deposited");
        }
    }
    public void withdraw(double amount){
        if(amount <= 0 || amount>balance){
            System.out.println("Insufficient Balance");
        } else {
            balance-=amount;
            System.out.println(amount + " Withdraw successfully");
        }
    }

    public void showDetail(){
        System.out.println("UserName: "+userName+" Account ID: "+accountId+" Balance: "+balance);
    }
    public static void main(String[] args) {

    }
}
