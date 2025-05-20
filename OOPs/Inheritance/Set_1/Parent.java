package OOPs.Inheritance.Set_1;

public class Parent {
    Parent(){
        System.out.println("Parent Constructor called.");
    }
}
class Child extends Parent{
    Child(){
        System.out.println("Child Constructor called.");
    }

    public static void main(String[] args) {
        Child obj = new Child();
    }
}
