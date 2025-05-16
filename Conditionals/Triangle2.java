package Conditionals;

import java.util.Scanner;
//Write a program to classify a triangle as equilateral, isosceles, or scalene based on its side lengths using Nested  if-else.
public class Triangle2 {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        System.out.printf("Enter Side A:");
        int sideA = inp.nextInt();
        System.out.printf("Enter Side B:");
        int sideB = inp.nextInt();
        System.out.printf("Enter Side C:");
        int sideC = inp.nextInt();
        int check = sideA + sideB+ sideC;
        if((sideA == sideB && sideA==sideC) && check==180){
            System.out.printf("Equilateral");
        } else {
            if((sideB==sideA || sideB==sideC || sideC==sideA) && check==180){
                System.out.printf("Isosceles");
            } else {
                if((sideC!=sideB && sideC!=sideA) && check==180){
                    System.out.printf("Scalene");
                } else {
                    System.out.printf("Not Triangle!");
                }
            }
        }
    }
}
