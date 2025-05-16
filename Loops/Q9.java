package Loops;

import java.util.Scanner;

//Write a program to take a number from the user and reverse that  number
public class Q9 {
    public static void main(String []args){
        Scanner takInp = new Scanner(System.in);
        System.out.printf("Enter num:");
        int num = takInp.nextInt();
        int rev =0;
        int rem;
        while(num!=0){
            rem = num%10;
            rev = rev*10+rem;
            num = num/10;
        }
        System.out.printf("Reverse number: "+ rev);
    }
}
