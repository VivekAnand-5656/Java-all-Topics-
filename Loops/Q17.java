package Loops;

import java.util.Scanner;

//Write a program to take two numbers from the user and print the prime number present between them.
public class Q17 {
    public static void main(String []args){
        Scanner inp = new Scanner(System.in);
        System.out.printf("Enter First num:");
        int num1 = inp.nextInt();
        System.out.printf("Enter Second num:");
        int num2 = inp.nextInt();
        int count;
        for(;num1<=num2;num1++){
            count=0;
            for(int j=1;j<=num1;j++){
                if(num1%j==0){
                    count++;
                }
            }
            if(count == 2){
                System.out.println("Prime Number's : " + num1);
            }
        }
    }
}
