package ExceptionHandling.Practice;

import java.util.Scanner;

public class Prac2 {
    public static void check(int age) {
        if(age < 18){
            throw new ArithmeticException("Age must be 18 or older");
        } else {
            System.out.println("You can vote");
        }
        System.out.println("Hello Vivek");
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = inp.nextInt();
        check(age);
    }
}
