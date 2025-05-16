package Loops;

import java.util.Scanner;

//Write a program to take two numbers from the user and print the count of numbers present between them.
public class Q10 {
    public static void main(String []args){
        Scanner takInp = new Scanner(System.in);
        System.out.printf("Enter First num:");
        int num1 = takInp.nextInt();
        System.out.printf("Enter Second num:");
        int num2 = takInp.nextInt();
        int count = 0;
        for(;num1<num2;num1++){
            count++;
        }
        System.out.printf("Count = "+ count);
    }
}
