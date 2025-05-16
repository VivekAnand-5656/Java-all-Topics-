package Conditionals;

import java.util.Scanner;
//Write a program that takes a number as input and checks if it is positive, negative, or zero using Nested if-else.
public class positiveNagative {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        System.out.printf("Enter num:");
        int num = inp.nextInt();
        if(num>0){
            System.out.printf("Positive Number!");
        } else if(num<0) {
            System.out.printf("Negative Number!");
        } else if(num==0){
            System.out.printf("Zero!");
        }
    }
}
