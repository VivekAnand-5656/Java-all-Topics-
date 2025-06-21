package ExceptionHandling.CodingAgePractice;

import java.util.Scanner;

public class CustomVotingSystem extends Exception {
   public CustomVotingSystem(String msg){
       super(msg);
   }
}
class VotingSystem{
    public static void register(int age) throws CustomVotingSystem{
        if(age < 18){
            throw  new CustomVotingSystem("Age must be 18 or older");
        } else {
            System.out.println("Voter registered");
        }
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = inp.nextInt();
        try {
            register(age);
        } catch (CustomVotingSystem check){
            System.out.println(check.getMessage());
        }
    }
}