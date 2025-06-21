package ExceptionHandling.ClassTestWork;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputError {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        try {
            System.out.println("Enter any integer");
            int num = inp.nextInt();
            System.out.println("Number: "+num);
        } catch (InputMismatchException check){
            System.out.println("Invalid input");
        }
    }
}
