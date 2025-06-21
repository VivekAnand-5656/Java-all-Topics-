package ExceptionHandling.ClassTestWork;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayError {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int arr[] = {10,50,20};
        try {
            System.out.println("Enter index ");
            int ind = inp.nextInt();
            System.out.println("Value: "+arr[ind]);
        } catch (ArrayIndexOutOfBoundsException ch){
            System.out.println(ch.getMessage());
        } catch (InputMismatchException ch){
            System.out.println("Invalid input");
        }
    }
}
