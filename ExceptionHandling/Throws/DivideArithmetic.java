package ExceptionHandling.Throws;

public class DivideArithmetic {
    public int divide(int num,int num2) throws ArithmeticException{
        return num/num2;
    }

    public static void main(String[] args) {
        DivideArithmetic dv = new DivideArithmetic();
        try {
            System.out.println(dv.divide(10,0));
        } catch (ArithmeticException e){
            System.out.println("Divisor is 0 not allowed");
        }
    }
}
