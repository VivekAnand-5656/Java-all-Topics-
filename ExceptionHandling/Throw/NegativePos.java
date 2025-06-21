package ExceptionHandling.Throw;

public class NegativePos {
    public static void cheking(int num){
        if(num <0){
            throw new ArithmeticException("Negative number");
        }
        System.out.println("Positive Number");
    }

    public static void main(String[] args) {
        cheking(-10);
    }
}
