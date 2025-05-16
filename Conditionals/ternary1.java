package Conditionals;

import java.util.Scanner;

//Create a program to check if a given number is even or odd using the ternary operator.
public class ternary1 {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        System.out.printf("Enter num:");
        int num = inp.nextInt();
        int store = (num%2==0)?5:10;
        System.out.print(store);
    }
}
