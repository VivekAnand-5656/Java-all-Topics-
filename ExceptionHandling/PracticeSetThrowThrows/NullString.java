package ExceptionHandling.PracticeSetThrowThrows;

public class NullString {
    public void checkStr(String name) throws NullPointerException{
        if(name == null){
            throw new NullPointerException("String is Empty! Please fill up");
        } else {
            System.out.println("Hello "+name);
        }
    }

    public static void main(String[] args) {
        NullString obj = new NullString();
        obj.checkStr(null);
    }
}
