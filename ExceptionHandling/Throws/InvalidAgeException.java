package ExceptionHandling.Throws;

public class InvalidAgeException extends Exception{
    public InvalidAgeException(String msg){
        super(msg);
    }

    public static void main(String[] args) throws InvalidAgeException {
        int age = 21;
        if(age<18){
            throw new InvalidAgeException("Age must be 18 or older.");
        } else{
            System.out.println("Eligble for vote.");
        }
    }
}
