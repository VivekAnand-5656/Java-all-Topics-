package Loops;

import java.util.Scanner;

//Write a program to take user input and check whether the number is perfect or not.
public class Q12 {
    public static void main(String []args){
        Scanner takeInp = new Scanner(System.in);
        System.out.printf("Enter num:");
        int num = takeInp.nextInt();
        int sum = 0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum = sum+i;
            }
        }
        if(sum==num){
            System.out.printf(num + " is Perfect Number.");
        } else {
            System.out.printf(num + " is not Perfect Number");
        }
    }
}
