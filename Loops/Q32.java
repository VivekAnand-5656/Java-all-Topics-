package Loops;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

//Write a program to take two number from user and print Armstrong numbers between the given rang
public class Q32 {
    public static void main(String []args){
        Scanner inp = new Scanner(System.in);
        System.out.printf("Enter First num:");
        int num1 = inp.nextInt();
        System.out.printf("Enter Second num:");
        int num2 = inp.nextInt();
        for(;num1<=num2;num1++){
            int dupl = num1;
            int count = 0;
            int sum =0;
            while(dupl!=0){
                count++;
                dupl/=10;
            }
            dupl=num1;

            while(dupl!=0){
                int rem = dupl%10;
                int power =1;
                for(int i=1;i<=count;i++){
                    power*=rem;
                }
                sum += power;
                dupl/=10;
            }

            if(sum == num1){
                System.out.println(num1);
            }
        }
    }
}
