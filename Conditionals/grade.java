package Conditionals;
//Write a program to calculate the grade of a student based on their marks using an else-if:
import java.util.Scanner;

public class grade {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        System.out.printf("Enter num:");
        int num = inp.nextInt();
        if(num>=95){
            System.out.printf("Grade A");
        } else if (num>=70) {
            System.out.printf("Grade B");
        } else if (num>=50) {
            System.out.printf("Grade C");
        } else if (num<50) {
            System.out.printf("Grade D");
        }
    }

}
