package OOPs.Abstraction;

public abstract class First {
     abstract void show();
}
class Car extends First{
    void show(){
        System.out.println("Hello Cagers");
    }

    public static void main(String[] args) {
        Car cc = new Car();
        cc.show();
    }
}

