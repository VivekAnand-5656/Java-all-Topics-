package Conditionals;

import java.util.Scanner;

//Create a program to check whether a character is uppercase or lowercase using the ternary operator.
public class ternary_alpha {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        System.out.printf("Enter char:");
        char ch = inp.next().charAt(0);
        String store = (ch>'a'&& ch<'z')? "Lowercase": (ch>'A' && ch<'Z')? "Uppercase" : "Other" ;

        System.out.printf("Result : " + store);
    }
}
