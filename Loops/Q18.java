package Loops;

import java.util.Scanner;

//Write a program to take a number from user and print from user input to 1
public class Q18 {
    public static void main(String []args){
        Scanner inp = new Scanner(System.in);
        System.out.printf("Enter num:");
        int num = inp.nextInt();
        for(;num>=1;num--){
            System.out.println(num);
        }
    }
}
