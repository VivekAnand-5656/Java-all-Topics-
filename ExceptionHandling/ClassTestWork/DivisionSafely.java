package ExceptionHandling.ClassTestWork;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionSafely {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        try {
            System.out.println("Enter First num");
            int num = inp.nextInt();
            System.out.println("Enter divisor");
            int divisor = inp.nextInt();
            int result = num/divisor;
            System.out.println("Result : "+result);
        } catch (ArithmeticException check){
            System.out.println("Cannot divide by Zero");
        } catch (InputMismatchException ch){
            System.out.println("Invalid input");
        }
    }
}
