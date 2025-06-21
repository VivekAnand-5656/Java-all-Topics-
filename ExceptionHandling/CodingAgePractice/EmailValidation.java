package ExceptionHandling.CodingAgePractice;

import java.util.Scanner;

public class EmailValidation extends Exception{
    public EmailValidation(String msg){
        super(msg);
    }
    public static void main(String[] args) throws EmailValidation {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter your email");
        String email = inp.nextLine();
        int check = 0;
        for(int i=0;i<email.length();i++){
            if(email.charAt(i) == '@' || email.charAt(i)=='.'){
                check++;
            }
        }
        if(check==2){
            System.out.println("Email submitted");
        } else {
            throw new EmailValidation("Invali Email");
        }
//
    }
}
