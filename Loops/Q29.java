package Loops;

import java.util.Scanner;

//Write a program to take a number from user and check that number is armstrong or not .
public class Q29 {
    public static void main(String []args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter num:");
        int num = inp.nextInt();
        int dupl = num;
        int count = 0;
        while(dupl!=0){
            count++;
            dupl/=10;
        }
        System.out.println(count);
        dupl=num;

        int sum =0;
        while(dupl!=0){
            int rem = dupl%10;
            int power =1;
            for(int i=1;i<=count;i++){
                power*=rem;
            }
            sum += power;
            dupl/=10;
        }
        System.out.println(sum);
        if(sum == num){
            System.out.println("Armstrong!");
        } else {
            System.out.println("Not Armstrong!");
        }
    }
}
