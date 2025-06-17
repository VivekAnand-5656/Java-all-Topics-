package OOPs.Encapsulation.Set_1;

public class User {
    private String userName;
    private long password;
    public void setUserName(String userName,long password){
        this.userName = userName;
        if(password <= 88888888l && password >= 10000000l){
            this.password = password;
        } else {
            System.out.println("Wrong password");
        }
    }
    public void login(String newUser,long newPass){
        if(userName.equals(newUser) && password == newPass){
            System.out.println("Login successfully");
        } else {
            System.out.println("Incorrect username or password");
        }
    }

    public static void main(String[] args) {
        User check = new User();
        check.setUserName("vivek@123",45859636l);
        check.login("vivek@123",45859636l);
    }
}
