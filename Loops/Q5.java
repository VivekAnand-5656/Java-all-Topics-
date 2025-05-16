package Loops;

import java.util.Scanner;

//Write a program to take two numbers from the user and .Find an even number between them.
public class Q5 {
    public static void main(String []args){
        Scanner takeInp = new Scanner(System.in);
        System.out.printf("Enter First num:");
        int num = takeInp.nextInt();
        System.out.printf("Enter Second num:");
        int num2 = takeInp.nextInt();
        System.out.println("Even Numbers:");
        for(;num<=num2;num++){
            if(num%2==0){
                System.out.println(num);
            }
        }
    }
}
