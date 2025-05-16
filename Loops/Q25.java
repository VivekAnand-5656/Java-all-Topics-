package Loops;

import java.util.Scanner;

//Write a program to print number 1 to 10 but skip whose divisible by 3 using CONTINUE keyword.
public class Q25 {
    public static void main(String []args){
        Scanner inp = new Scanner(System.in);
        System.out.printf("Enter num:");
        int num = inp.nextInt();
        for(int i=1;i<=num;i++){
            if(i%3==0){
                continue;
            }else {
                System.out.println(i);
            }
        }
    }
}
