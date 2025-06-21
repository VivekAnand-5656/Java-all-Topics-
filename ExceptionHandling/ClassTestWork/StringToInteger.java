package ExceptionHandling.ClassTestWork;

import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        try {
            System.out.println("Enter string: ");
            String str = inp.nextLine();
            Integer num = Integer.parseInt(str);
            System.out.println("Number: "+num);
        } catch (NumberFormatException ch){
            System.out.println("Invalid input! Please input number format");
        }
    }
}
