package Loops;

import java.util.Scanner;

//Write a program to take two number from user and find average of all number present between them.
public class Q21 {
    public static void main(String []args){
        Scanner inp = new Scanner(System.in);
        System.out.printf("Enter First num:");
        int num1 = inp.nextInt();
        System.out.printf("Enter Second num:");
        int num2 = inp.nextInt();
        int count =0;
        int sum = 0;
        for(;num1<=num2;num1++){
            count++;
            sum+=num1;
        }
        int avg = sum/count;
        System.out.printf("Average is " + avg);
    }
}
