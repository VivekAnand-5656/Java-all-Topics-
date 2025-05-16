package Loops;


import java.util.Scanner;

//Write a program to take two numbers from the user and .Find an even number between them.
public class Q6 {
    public static void main(String []args){
        Scanner takInp = new Scanner(System.in);
        System.out.printf("Enter First num:");
        int num1 = takInp.nextInt();
        System.out.printf("Enter Second num:");
        int num2 = takInp.nextInt();
        System.out.println("Odd Numbers:");
        for(;num1<=num2;num1++){
            if(num1%2!=0){
                System.out.println(num1);
            }
        }
    }
}
