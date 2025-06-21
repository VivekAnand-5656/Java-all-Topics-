package ExceptionHandling.Throw;

public class NullMessage {
    public static void check(String str){
        if(str == null){
            throw new NullPointerException("String is empty");
        }
        System.out.println(str);
    }

    public static void main(String[] args) {
        check(null);
    }
}
