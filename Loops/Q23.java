package Loops;

import java.awt.*;
import java.util.Scanner;

//Write a program to take a number from user and print the table of that number .
public class Q23 {
    public static void main(String []args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter Num:");
        int num = inp.nextInt();
        int table = 1;
        for(int i=1;i<=10;i++){
            table = num * i;
            System.out.println(num + " x " + i + " = " + table);
        }
    }
}
