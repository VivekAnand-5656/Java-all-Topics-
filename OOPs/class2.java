package OOPs;

public class class2 {
    void greet(){
        System.out.println("Welcome to java programming.");
    }
    public static void main(String[]args){
        String str = "Welcome to coding age";
        System.out.println("Length : "+ str.length());
        System.out.println("Square root of 25 is : "+ Math.sqrt(25));
        class2 cl = new class2();
        cl.greet();
    }
}
