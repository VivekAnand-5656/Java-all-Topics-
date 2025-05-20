package OOPs.Super;

public class First {
    First(){
        System.out.println("This is parent class");
    }
}
class Bike extends First{
    Bike(){
        System.out.println("This is bike");
    }
}
class Child extends First{
    Child(){
        super();
        System.out.println("This is Child Class");
    }

    public static void main(String[] args) {
//        Child obj = new Child();
        Bike ob = new Bike();
    }
}
