package ExceptionHandling.CodingAgePractice;

import java.util.Scanner;

public class AccountLockedException extends Exception{
    public AccountLockedException(String msg){
        super(msg);
    }

    public static void main(String[] args) throws AccountLockedException {
        Scanner inp = new Scanner(System.in);
        String userName = "vivek_kumar123";
        String password = "vivek@123";
                    String user="";
                    String pass="";
                    int time = 3;
                    for(int i=1;i<=time;i++){
                        System.out.println("Enter userName");
                        user = inp.nextLine();
                        System.out.println("Enter password");
                        pass = inp.nextLine();
                        if(user.equals(userName) && pass.equals(password)){
                            System.out.println("Login Successful");
                            return;
                        } else {
                            if(i==time){
                                System.out.println("Complete Time");
                            } else {
                                System.out.println("You have only "+(time-i)+" chance");
                            }
                        }
                    }
                    if(user.equals(userName) && pass.equals(password)){
                        System.out.println("Login Successul");
                    } else {
                        throw new AccountLockedException("Account blocked after 3 failed login");
                    }

    }
}
