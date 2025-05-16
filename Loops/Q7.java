package Loops;

import java.util.Scanner;

//Write a program to take a number from the user and print the factorial of the given number.
public class Q7 {
    public static void main(String []args){
        Scanner takInp = new Scanner(System.in);
        System.out.printf("Enter num:");
        int num = takInp.nextInt();
        int fact =1;
        for(int i=1;i<=num;i++){
            fact = fact*i;
        }
        System.out.printf("Factorial is " + fact);
    }
}
