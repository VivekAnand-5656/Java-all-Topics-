package Loops;

import java.util.Scanner;

//Write a program to print all the multiples of 5 between 1 and 100
public class Q13 {
    public static void main(String []args){
        Scanner takInp = new Scanner(System.in);
        System.out.printf("Enter num:");
        int num = takInp.nextInt();
        for(int i=1;i<=100;i++){
            if(i%num==0){
                System.out.println(i);
            }
        }
    }
}
