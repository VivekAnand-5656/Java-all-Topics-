package Loops;

import java.util.Scanner;

//Write a program to keep taking input from the user until he gives a negative number
public class Q28 {
    public static void main(String []args){
        Scanner inp = new Scanner(System.in);
        int num;
         do {
             System.out.println("Enter number:");
             num = inp.nextInt();
         }while (num>=0);
         System.out.println("Negative number entereed !");
    }
}
