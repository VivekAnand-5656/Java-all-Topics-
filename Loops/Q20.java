package Loops;

import java.util.Scanner;

//Write a program to take a number from user and print the sum of 1 to that number.
public class Q20 {
    public static void main(String []args){
        Scanner inp = new Scanner(System.in);
        System.out.printf("Enter num:");
        int num = inp.nextInt();
        int sum = 0;
        for(int i=1;i<=num;i++){
            sum+=i;
        }
        System.out.printf("Sum is : "+ sum);
    }
}
