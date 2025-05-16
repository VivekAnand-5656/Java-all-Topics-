package Loops;

import java.util.*;

public class Q1 {
    public static void main(String []args){
        Scanner vivek = new Scanner(System.in);
        System.out.println("Enter sp:");
        int a= vivek.nextInt();
        System.out.println("Enter ep:");
        int b = vivek.nextInt();
        for(;a<=b;a++){
            System.out.println("Num:"+ a);
        }
    }
}
