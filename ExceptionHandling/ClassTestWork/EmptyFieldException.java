package ExceptionHandling.ClassTestWork;

import java.util.Scanner;

public class EmptyFieldException extends Exception{
    public EmptyFieldException(String msg){
        super(msg);
    }
}
class InvalidUserNameException extends Exception{
    public InvalidUserNameException(String msg){
        super(msg);
    }
}
class InvalidPasswordException extends Exception{
    public InvalidPasswordException(String msg){
        super(msg);
    }
}
class StudentLoginVerify {
    private String userName;
    private String password;
    public void loginSystem(String userName,String password) throws EmptyFieldException,InvalidUserNameException,InvalidPasswordException{
        this.userName = userName;
        this.password = password;
        if((userName == null || userName.isEmpty()) || (password == null || password.isEmpty())){
            throw new EmptyFieldException("Empty UserName or Password");
        }
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter User name: ");
        String user = inp.nextLine();
        System.out.println("Enter Password");
        String pass = inp.nextLine();
        if(userName.equals(user)){
            if(password.equals(pass)){
                System.out.println("Login Successfully");
            } else {
                throw new InvalidPasswordException("Invalid Password");
            }
        } else {
            throw new InvalidUserNameException("Invalid Username");
        }
    }

    public static void main(String[] args) throws EmptyFieldException,InvalidUserNameException,InvalidPasswordException{
        StudentLoginVerify obj = new StudentLoginVerify();
        try {
            obj.loginSystem("vivek_anand56","vivek_5656");
        } catch (EmptyFieldException ch){
            System.out.println("Error: "+ ch.getMessage());
        } catch (InvalidUserNameException ch){
            System.out.println("Error: "+ ch.getMessage());
        } catch (InvalidPasswordException ch){
            System.out.println("Error: "+ ch.getMessage());
        }
    }
}
