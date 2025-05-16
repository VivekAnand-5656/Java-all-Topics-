package Loops;

import java.util.Scanner;

//Write a program to take two number from user and .Find the sum of all even number Present between them
public class Q22 {
    public static void main(String []args){
        Scanner inp = new Scanner(System.in);
        System.out.printf("Enter First num:");
        int num1 = inp.nextInt();
        System.out.printf("Enter Second num:");
        int num2 = inp.nextInt();
        int sumEven = 0;
        int sumOdd = 0;
        for(;num1<=num2;num1++){
            if(num1%2==0){
                sumEven+=num1;
            } else {
                sumOdd+=num1;
            }
        }
        System.out.println("Sum Even :" + sumEven + " Sum Odd : " + sumOdd);
    }
}
