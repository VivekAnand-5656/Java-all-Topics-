package Conditionals;

import java.util.Scanner;

//Develop a calculator program that takes two numbers and an operator (+,-, *, /) as input and performs the operation using a switch statement.
public class calculator {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter First num:");
        int num1 = inp.nextInt();
        System.out.printf("Enter operator:");
        char op = inp.next().charAt(0);
        System.out.println("Enter Second Num:");
        int num2 = inp.nextInt();

        float total =0f;
        switch(op){
            case '+':
                total = num1+num2;
                System.out.printf("Sum:" + total);
                break;
            case '-':
                total = num1-num2;
                System.out.printf("Sub:" + total);
                break;
            case '*':
                total = num1*num2;
                System.out.printf("Multi:" + total);
                break;
            case '/':
                total = num1/num2;
                System.out.printf("Division:" + total);
                break;
            case '%':
                total = num1%num2;
                System.out.printf("Remainder:" + total);
                break;
            default:
                System.out.printf("Incorrect Operator!");
        }
    }
}