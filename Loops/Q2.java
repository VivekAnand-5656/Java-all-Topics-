package Loops;

import java.util.*;
//Write a program to take a number from a user and print that number 100 times

public class Q2 {
    public static void main(String []args){
        Scanner vivek = new Scanner(System.in);
        System.out.println("Enter num:");
        int num = vivek.nextInt();
        for(int i=1;i<=100;i++){
            System.out.println(i+":"+ num);
        }
    }
}
