package ExceptionHandling.ClassTestWork;

import java.util.*;

public class DividerProgram {
    public void checkDivide() throws ArithmeticException, InputMismatchException {
        Scanner inp = new Scanner(System.in);
        try {
            System.out.println("Enter Number:- ");
            int num = inp.nextInt();
            System.out.println("Enter Divisor:- ");
            int divisor = inp.nextInt();
            try {
                int result = num/divisor;
                System.out.println("Result: "+result);
            } catch (ArithmeticException ch){
                throw new ArithmeticException("Divisor does not exixt 0");
            }
        } catch (InputMismatchException ch){
            throw new InputMismatchException("Error :- Input must be Number Format");
        } finally {
            System.out.println("Operation Completed!");
        }
    }

    public static void main(String[] args) {
        DividerProgram obj = new DividerProgram();
        obj.checkDivide();
    }
}
