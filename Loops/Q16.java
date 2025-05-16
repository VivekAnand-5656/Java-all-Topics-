package Loops;

import java.util.Scanner;

//Write a program to take a number from a user and check if that number is prime or not
public class Q16 {
    public static void main(String []args){
        Scanner inp = new Scanner(System.in);
        System.out.printf("Enter num:");
        int num = inp.nextInt();
        int count =0;
        for(int i = 1;i<=num;i++){
             if(num%i==0){
                 count++;
             }
        }
        if(count ==2){
            System.out.printf("Prime");
        } else {
            System.out.printf("Not Prime");
        }
    }
}
