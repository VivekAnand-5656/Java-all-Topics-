package ExceptionHandling.TryCatch;

import java.util.Arrays;

public class ArrayChecking {
    public void checkArray(){
        int arr[] = {10,50,6,3,33,21};
        try {
            for(int i=0;i<15;i++){
                try {
                    int div = arr[i]/i;
                    System.out.println(div);
                } catch (ArithmeticException chec){
                    System.out.println("Division by zero is not allowed");
                }
            }
        } catch (ArrayIndexOutOfBoundsException check){
            System.out.println("Array index out of bound!");
        }
    }
    public static void main(String[] args) {
        ArrayChecking obj = new ArrayChecking();
        obj.checkArray();
    }
}
