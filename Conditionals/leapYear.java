package Conditionals;

import java.util.Scanner;
//Write a program to determine whether a year is a leap year using nested if-else.
public class leapYear {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        System.out.printf("Enter year:");
        int year = inp.nextInt();
        if(year%4==0 && year%100!=0){
            System.out.printf(year + " is Leap year!");
        } else if (year%400==0 && year%100!=0) {
            System.out.printf(year + " is Leap year!");
        } else {
            System.out.printf(year + " is not Leap year!");
        }
    }
}
