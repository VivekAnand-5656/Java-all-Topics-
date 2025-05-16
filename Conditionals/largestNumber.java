package Conditionals;

import java.util.Scanner;
//.Write a program to find the largest of two numbers using if-else
public class largestNumber {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        System.out.printf("Enter Num:");
        int num = inp.nextInt();
        System.out.printf("Enter Num2:");
        int num2 = inp.nextInt();
        if(num>num2){
            System.out.printf(num + " is Largest!");
        } else {
            System.out.printf(num2 + " is Largest!");
        }
    }
}
