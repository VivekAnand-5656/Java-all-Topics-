package OOPs.Encapsulation.Set_1;

public class BankDatas {
    private String name;
    private long acNumber;
    private double balance;
    private long mob;
    public void setName(String name,long acNumber,double balance,long mob){
        this.name = name;
        this.acNumber = acNumber;
        if(balance>0){
            this.balance = balance;
        } else {
            System.out.println("Not valid amount");
        }
        if(mob<9999999999l && mob > 1000000000l){
            this.mob = mob;
        }else {
            System.out.println("Enter correct Mobile num");
        }
    }
    public String getName(){
        return name;
    }
    public long getAcNumber(){
        return acNumber;
    }
    public double getBalance(){
        return balance;
    }
    public long getMob(){
        return mob;
    }
    public void detailsBank(){
        System.out.println("Holder Name: "+getName());
        System.out.println("Account Number: "+getAcNumber());
        System.out.println("Balance: "+getBalance());
        System.out.println("Mobile No.: "+getMob());
    }

    public static void main(String[] args) {
        BankDatas bk = new BankDatas();
        bk.setName("Vivek Anand",47182536952l,55000,7481873859l);
        bk.detailsBank();
    }
}
