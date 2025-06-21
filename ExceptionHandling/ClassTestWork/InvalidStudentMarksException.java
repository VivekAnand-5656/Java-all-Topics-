package ExceptionHandling.ClassTestWork;

import ExceptionHandling.CodingAgePractice.InvalidMarksException;
import ExceptionHandling.Throws.InvalidAgeException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InvalidStudentMarksException extends Exception{
    public InvalidStudentMarksException(String msg){
        super(msg);
    }


    public static void main(String[] args) throws InvalidStudentMarksException{
        Scanner inp = new Scanner(System.in);
        double marks;
        try {
            System.out.println("Enter marks");
            marks = inp.nextDouble();
        } catch (InputMismatchException ch){
            throw new InputMismatchException("Invalid input");
        }
        if((marks >0) && (marks < 100)){
            System.out.println("Marks: "+marks);
        } else {
            throw new InvalidStudentMarksException("Please Enter valid marks");
        }

    }
}
