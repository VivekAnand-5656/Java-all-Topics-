package Loops;

import java.util.Scanner;

//Write a program to take a number from the user and find the maximum and minimum digit of that number
public class Q15 {
    public static void main(String []args){
         Scanner takeInp = new Scanner(System.in);
         System.out.println("Enter number:");
         int num = takeInp.nextInt();
         int max = 0;
         int min = 9;
         int rem;
         while(num!=0){
             rem = num%10;
             if(rem > max){
                 max = rem;
             }
             if(rem < min){
                 min = rem;
             }
             num = num/10;
         }
         System.out.println("Maximum : " + max);
         System.out.println("Minimum : " + min);
    }
}
