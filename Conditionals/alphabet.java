package Conditionals;

import java.util.Scanner;

//Develop a program that determines whether a given character is uppercase, lowercase, a digit, or a special character using a switch statement.
public class alphabet {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        System.out.printf("Enter char:");
        char alpha = inp.next().charAt(0);
        switch(Character.getType(alpha)){
            case Character.UPPERCASE_LETTER:
                System.out.printf("UpperCase");
                break;
            case Character.LOWERCASE_LETTER:
                System.out.printf("Lowercase");
                break;
            case Character.DECIMAL_DIGIT_NUMBER:
                System.out.printf("Digit");
                break;
            default:
                System.out.printf("Special Character");
        }
    }
}
