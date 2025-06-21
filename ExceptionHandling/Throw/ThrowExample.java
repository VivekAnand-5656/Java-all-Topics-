package ExceptionHandling.Throw;

public class ThrowExample {
    public static void checkAge(int age){
        if(age<18){
            throw new ArithmeticException("Not eligble to vote");
        } else {
            System.out.println("Eligble to vote");
        }
    }
    public static void main(String[] args) {
        checkAge(15);
    }
}