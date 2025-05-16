package Conditionals;
//Write a program to check whether a number is divisible by  2 and 3 using Nested if-else

import java.util.Scanner;

public class divisible3 {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        System.out.printf("Enter num:");
        int num = inp.nextInt();
        if(num%2==0){
            if(num%3==0){
                System.out.printf("Divisible by 2 and 3.");
            }else {
                System.out.printf("Divisible by 2 but not Divisible by 3.");
            }
        } else {
            if(num%3==0){
                System.out.print("Divisible by 3 but not Divisible by 2.");
            } else {
                System.out.print("Not Divisible by 2 and 3");
            }
        }
    }
}
