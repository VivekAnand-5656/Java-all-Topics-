package Loops;

import java.util.Scanner;
//Write a program to print alphabets from Z to A
public class Q3 {
    public static void main(String []args){
        Scanner str = new Scanner(System.in);
        for(char ch ='Z';ch>='A';ch--){
            System.out.print(ch+" ");
        }
    }
}
