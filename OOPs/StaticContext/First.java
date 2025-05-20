package OOPs.StaticContext;

public class First {
    static int a;
    static{
        a=10;
        System.out.println("Static block executed");
    }

    public static void main(String[] args) {
        System.out.println("Welcome to coding age");
        System.out.println(a);
    }
}
