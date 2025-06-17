package OOPs.StaticContext;

public class Second {
    static int count=10;
    static void num(){
        int sum=count+count;
        System.out.println("Sum: "+sum);
    }
    static {
        int sum = count+5;
        System.out.println("A: "+sum); // At First it will be work
    }
    {
        System.out.println("Hello Vivek");
    }

    public static void main(String[] args) { // second it will be work
        Second obj = new Second();
        int a=5,b=3;
        int sum=a+b;
        System.out.println("Add: "+sum);
        num();

    }
}
