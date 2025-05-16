package Conditionals;

import java.util.Scanner;

//Create a program to simulate a menu-driven application using switch. For example:
//        ● Option 1: Add two numbers
// ● Option 2: Subtract two numbers
// ● Option 3: Multiply two numbers
// ● Option 4: Exit
public class menu_Driven {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        System.out.printf("Enter num:");
        int num = inp.nextInt();
        switch(num){
            case 1:
                System.out.printf("Add two numbers");
                break;
            case 2:
                System.out.printf("Subtract two numbers");
                break;
            case 3:
                System.out.printf("Multiple two numbers");
                break;
            case 4:
                System.out.print("Divide Two numbers");
                break;
            case 5:
                System.out.printf("Exit!");
            default:

        }
    }
}
