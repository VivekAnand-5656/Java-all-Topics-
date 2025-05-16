package OOPs.Overloading.Sets;

public class Bank {
    int getIntrestRate(){
        return 0;
    }
}
class SBI extends Bank{
    int intrest(){
        return 5;
    }
}
class HDFC extends Bank{
    int intrest(){
        return 10;
    }
}
class ICICI extends Bank{
    int intrest(){
        return 7;
    }

//class Man{
    public static void main(String[] args) {
        SBI sb = new SBI();
        HDFC hd = new HDFC();
        ICICI ic = new ICICI();
        System.out.println("SBI Interest Rate: "+sb.intrest()+"%");
        System.out.println("HDFC Interest Rate: "+hd.intrest()+"%");
        System.out.println("ICICI Interest Rate: "+ic.intrest()+"%");
    }
}
