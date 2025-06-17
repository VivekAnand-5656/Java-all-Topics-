package OOPs.Encapsulation.PracticeSet;

import java.util.Scanner;

public class Login {
    private String userName;
    private String password;

    public void setUserName(String userName,String password){
        this.userName = userName;
        this.password = password;
    }
    public String getUserName(){
        return userName;
    }
    public String getPassword(){
        return password;
    }
    public void authentiCate(String user,String pass){
        if(user.equals(userName) && pass.equals(password)){
                System.out.println("Login Successfully.");
        } else {
            System.out.println("Invalid Username or Password");
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter UserName: ");
        String user = inp.nextLine();
        System.out.println("Enter Password: ");
        String pass = inp.nextLine();

        Login log = new Login();
        log.setUserName("vivekDevil56","vivan@5656");
        log.authentiCate(user,pass);
    }

}
