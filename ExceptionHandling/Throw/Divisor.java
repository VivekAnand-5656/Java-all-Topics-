package ExceptionHandling.Throw;

public class Divisor {
    public static void divisor(int a,int di){
        if(di==0){
            throw new ArithmeticException("0 is not allowed");
        }else {
            int res = a/di;
            System.out.println("Result: "+res);
        }
    }

    public static void main(String[] args) {
        divisor(10,0);
    }
}
