package ExceptionHandling.CodingAgePractice;

import java.util.*;

public class ScannerHandle {
    public static void takeInput() throws InputMismatchException,ArithmeticException {
        Scanner inp = new Scanner(System.in);
        try {
            System.out.println("Enter num1: ");
            int num1 = inp.nextInt();
            System.out.println("Enter num2: ");
            int divisor = inp.nextInt();
            int result = num1 / divisor;
            System.out.println("Result: "+result);
        } catch (InputMismatchException check){
            System.out.println("Invalid input");
        } catch (ArithmeticException check){
            System.out.println("0 not allowed");
        }

    }
    public static void main(String[] args) {
        takeInput();
    }
}
