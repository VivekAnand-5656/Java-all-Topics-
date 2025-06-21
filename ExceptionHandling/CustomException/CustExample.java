package ExceptionHandling.CustomException;

public class CustExample extends Exception {
    public CustExample(String msg){
        super(msg);
    }

    public static void main(String[] args) throws CustExample {
        int age = 16;
        if(age <18){
            throw new CustExample("Not eligble for vote");
        } else {
            System.out.println("Eligble for vote");
        }
    }
}
