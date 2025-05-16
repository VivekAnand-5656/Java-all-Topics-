package Conditionals;

import java.util.Scanner;

//Write a program to find the largest of three numbers using the ternary operator.
public class ternary_largest {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        System.out.printf("Enter first num:");
        int num = inp.nextInt();
        System.out.printf("Enter second num:");
        int num2 = inp.nextInt();
        System.out.printf("Enter third num:");
        int num3 = inp.nextInt();
        int result = (num>num2 && num>num3)? num: (num2>num3 && num2>num)? num2 : num3;
        System.out.printf("Result : " + result);

    }
}
