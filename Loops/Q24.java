package Loops;

import java.util.Scanner;

//.Write a program to take a number from user and count the digit present in that number .
public class Q24 {
    public static void main(String []args){
        Scanner inp = new Scanner(System.in);
        System.out.printf("Enter num:");
        int num = inp.nextInt();
        int count = 0;
        while(num!=0){
            count++;
            num/=10;
        }
        System.out.printf("Digit : " + count);
    }
}
