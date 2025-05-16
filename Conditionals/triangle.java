package Conditionals;

import java.util.Scanner;
//.Write a C program to check whether a triangle is valid or not if angles are given
public class triangle {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        System.out.printf("Enter side a:");
        int side_A = inp.nextInt();
        System.out.printf("Enter side b:");
        int side_B = inp.nextInt();
        System.out.printf("Enter side c:");
        int side_C = inp.nextInt();
        int check = side_A + side_B + side_C;
        if(check == 180 && side_A>0 && side_B>0 && side_C>0){
            System.out.printf("Valid Triangle!");
        } else {
            System.out.printf("Not Valid Triangle!");
        }
    }
}
