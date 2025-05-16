package Conditionals;

import java.util.Scanner;

//Write a program that calculates the electricity bill based on usage:
//        ● Units <= 100: ₹5 per unit
// ● Units <= 300: ₹7 per unit
// ● Units > 300: ₹10 per unit
//Use an else-if for the implementation.
public class elec_bill {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        System.out.printf("Enter Unit:");
        int unit= inp.nextInt();
        int bill=0;
        if(unit<=100){
            bill = unit*5;
            System.out.printf("Bill : "+ bill);
        } else if (unit<=300) {
            bill = unit*7;
            System.out.printf("Bill : "+ bill);
        } else if (unit > 300) {
            bill = unit*10;
            System.out.printf("Bill : "+ bill);
        }
    }
}
