package Loops;

import java.util.Scanner;

//Write a program to take two numbers from the user one as a base ,second as a power calculate and print.
public class Q8 {
    public static void main(String []args){
        Scanner takInp = new Scanner(System.in);
        System.out.printf("Enter base:");
        int base = takInp.nextInt();
        System.out.printf("Enter power:");
        int power = takInp.nextInt();
        int result=1;
        for(int i=1;i<=power;i++){
            result = base*result;
        }
        System.out.printf("Result is " + result);
    }
}
