package OOPs.Inheritance;

public class Bird {
    void fly(){
        System.out.println("Bird is flying.");
    }
}
class Sparrow extends Bird{
    void eat(){
        System.out.println("Sparrow is eating.");
    }

    public static void main(String[] args) {
        Sparrow ft = new Sparrow();
        ft.fly();
        ft.eat();
    }
}
