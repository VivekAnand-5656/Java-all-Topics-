package Conditionals;

import java.util.Scanner;

public class Traffic {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        System.out.printf("Enter Command:");
        int num = inp.nextInt();
        switch(num){
            case 1:
                System.out.println("Red");
                break;
            case 2:
                System.out.println("Green");
                break;
            case 3:
                System.out.println("Yellow");
                break;
            default:
                System.out.println("Incorrect Command!");
        }
    }
}
