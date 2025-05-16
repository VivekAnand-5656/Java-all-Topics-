package Loops;

import java.util.Scanner;

//Write a program to take two number from user and print palindrome numbers between the given rang
public class Q31 {
    public static void main(String []args){
        Scanner inp = new Scanner(System.in);
        System.out.printf("Enter first num:");
        int num1 = inp.nextInt();
        System.out.printf("Enter second num:");
        int num2 = inp.nextInt();
        for(;num1<=num2;num1++){
            int rev=0;
            int temp = num1;
            while(temp!=0){
                int rem = temp%10;
                rev = rev*10+rem;
                temp/=10;
            }
            if(rev==num1){
                System.out.println(num1);
            }
        }
    }
}
