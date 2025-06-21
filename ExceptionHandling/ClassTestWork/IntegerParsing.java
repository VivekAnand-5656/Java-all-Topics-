package ExceptionHandling.ClassTestWork;

import java.util.Scanner;

public class IntegerParsing {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        try {
            System.out.println("Enter number");
            String num = inp.nextLine();
            System.out.println("Enter divisor");
            String divisor = inp.nextLine();
            Integer nums = Integer.parseInt(num);
            Integer divs = Integer.parseInt(divisor);
            try {
                Integer result = nums /divs;
                System.out.println("Result: "+result);
            } catch (ArithmeticException ch){
                System.out.println("Not allow to divide by 0");
            }
        } catch (NumberFormatException ch){
            System.out.println("Invalid Number Format");

        }
    }
}
