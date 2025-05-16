package Loops;

import java.util.Scanner;

//Write a program to take two numbers from the user and find the greatest common factor of them
public class Q11 {
    public static void main(String []args){
        Scanner takInp = new Scanner(System.in);
        System.out.printf("Enter num1:");
        int num1 = takInp.nextInt();
        System.out.printf("Enter num2:");
        int num2 = takInp.nextInt();
        int gcf=0;
        for(int i=1;i<=num1 && i<=num2;i++){
            if(num1%i==0 && num2%i==0){
                gcf=i;
            }
        }
        System.out.printf("GCF = "+ gcf);
    }
}
