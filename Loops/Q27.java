package Loops;

import java.util.Scanner;

//Write a program to take a number from user and print fibonacci number till user’s input
public class Q27 {
    public static void main(String []args){
        Scanner inp = new Scanner(System.in);
        System.out.printf("Enter Num:");
        int num = inp.nextInt();
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        for(int i=0;i<=num;i++){
            int sum = a + b;
            System.out.println(sum);
            a = b;
            b = sum;
        }
    }
}
