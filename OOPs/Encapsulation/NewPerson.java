package OOPs.Encapsulation;

public class NewPerson {
    private String name;
    private int age;
    private double balance;

    public void setName(String name,int age,double balance){
        this.name = name;
        if(age < 0){
            System.out.println("Incorrect age");
        } else {
            this.age = age;
        }
        if(balance < 0){
            System.out.println("Incorrect amount");
        } else {
            this.balance = balance;
        }
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return  age;
    }
    public double getBalance(){
        return balance;
    }

    public static void main(String[] args) {

    }
}
