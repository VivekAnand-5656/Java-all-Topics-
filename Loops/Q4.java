package Loops;

import java.util.Scanner;

//Write a program to take the alphabet from the user and print from the user input till 'a'
public class Q4 {
    public static void main(String []args){
        Scanner str = new Scanner(System.in);
        System.out.printf("Enter Char:");
        char ch = str.next().charAt(0);
        for(;ch>='a';ch--){
            System.out.printf(ch+" ");
        }
    }
}
