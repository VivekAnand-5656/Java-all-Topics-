package ExceptionHandling.CodingAgePractice;

import java.util.Scanner;

public class InvalidMarksException extends RuntimeException{
    public InvalidMarksException(String msg){
        super(msg);
    }

    public static void main(String[] args) throws InvalidMarksException {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter marks");
        double marks = inp.nextDouble();
        if(marks >= 0 && marks <= 100){
            System.out.println("Marks Accepted");
        } else {
            throw new InvalidMarksException("Marks must be between 0 to 100");
        }

        }
    }