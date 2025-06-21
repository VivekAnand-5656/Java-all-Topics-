package ExceptionHandling.Throw;

public class CustomPasswordCheck {
    public static void password(String pass){
        if(pass.length() < 6){
            throw new IllegalArgumentException("Password is too short");
        }
        System.out.println("Password: "+pass);
    }

    public static void main(String[] args) {
        password("4152");
    }
}
