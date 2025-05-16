package Loops;

import java.util.Scanner;

//Write a program to take alphabet from user and print from 'a' to till input.
public class Q19 {
    public static void main(String []args){
        Scanner inp = new Scanner(System.in);
        System.out.printf("Enter Char:");
        char alpha = inp.next().charAt(0);
        for(char ch = 'a';ch<=alpha;ch++){
            System.out.printf(ch + " ");
        }
    }
}
