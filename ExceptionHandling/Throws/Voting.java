package ExceptionHandling.Throws;

public class Voting {
    public static void vote(int age) throws Exception{
        if(age < 18){
            throw new Exception("Age must be 18 or greater than 18");
        } else {
            System.out.println("You can vote");
        }
    }

    public static void main(String[] args) {
        try {
            vote(24);
        } catch (Exception check){
            System.out.println(check.getMessage());
        }
    }
}
