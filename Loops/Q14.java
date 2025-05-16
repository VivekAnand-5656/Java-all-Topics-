package Loops;

import java.util.Scanner;

//Write a program to take a number from the user and find the first and last digit of that number
public class Q14 {
    public static void main(String []args){
        Scanner takInp = new Scanner(System.in);
        System.out.printf("Enter num:");
        int num = takInp.nextInt();
        int last = num%10;
        while(num>=10){
            num = num/10;
        }
        int first = num;
        System.out.println("Firs Digit: "+ first);
        System.out.println("Last Digit: "+ last);
    }
}
