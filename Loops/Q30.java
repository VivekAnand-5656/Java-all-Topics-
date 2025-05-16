package Loops;

import java.util.Scanner;

//Write a program to take two number from user and print “ Coding “ on Even number  and     “ Age “ on Odd number.
public class Q30 {
    public static void main(String []args){
        Scanner inp = new Scanner(System.in);
        System.out.printf("Enter first num:");
        int num1 = inp.nextInt();
        System.out.printf("Enter second num:");
        int num2 = inp.nextInt();
        for(;num1<=num2;num1++){
            if(num1%2==0){
                System.out.println("Coding");
            } else {
                System.out.println("Age");
            }
        }
    }
}
