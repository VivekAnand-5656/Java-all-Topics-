package Conditionals;

import java.util.Scanner;
//Write a C program to input cost price and selling price of a product and check profit or loss using if-else
public class profitloss {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        System.out.printf("Enter Cost Price:");
        int costP = inp.nextInt();
        System.out.printf("Enter Selling Price:");
        int sellP = inp.nextInt();
        if(costP < sellP){
            System.out.printf("Profit!");
        } else {
            System.out.printf("Loss!");
        }
    }
}
