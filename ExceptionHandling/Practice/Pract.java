package ExceptionHandling.Practice;

import java.util.Scanner;

public class Pract {
    public static void main(String[] args) {
        int arr[] = new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num:");
        int a = sc.nextInt();
        int b =sc.nextInt();
        try {
            try{
                System.out.println(a/b);
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
            }
            System.out.println(arr[4]);
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
