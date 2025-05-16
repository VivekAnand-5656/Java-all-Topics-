package Loops;

import java.util.Scanner;

//Write a program to take a number from user and check that number is palindrome or not .
public class Q26 {
    public static void main(String []args){
        Scanner inp = new Scanner(System.in);
        System.out.printf("Enter num:");
        int num = inp.nextInt();
        int dupl = num;
        int rem;
        int rev =0;
        while(num!=0){
            rem = num%10;
            rev = rev * 10 +rem;
            num = num/10;
        }
        if(rev == dupl){
            System.out.printf("Palindrome!");
        } else {
            System.out.printf("Not Palindrome!");
        }
    }
}
