package OOPs.Set_1;

import java.util.Scanner;

public class Account {
    String userName;
    String password;
    boolean loginStatus;
    void login(String inputPassword){
        if(password.equals(inputPassword)){
            loginStatus=true;
            System.out.println("Login Successful!");
        } else {
            System.out.println("Incorrect Password!");
        }
    }
    void logout(){
        if(loginStatus==false){
            System.out.println("You have been logedout");
        }
    }
    void displayStatus(){
        if(loginStatus==true){
            System.out.println(userName+" logged in");
        } else {
            System.out.println(userName+" Logged out");
        }
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Account check = new Account();
        check.userName = "vivek5656";
        check.password = "vivek@123";
        check.loginStatus = false;
        System.out.printf("Enter Password: ");
        String pw = inp.nextLine();
        check.login(pw);
        check.logout();
        check.displayStatus();
    }
}
