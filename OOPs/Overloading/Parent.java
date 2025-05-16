package OOPs.Overloading;

public class Parent {
    void show(){
        System.out.println("Parent Class method show.");
    }
}
class Childs extends Parent{
    void show(){
        System.out.println("Child class method.");
    }
    void show(String name){
        System.out.println("Child class name: "+name);
    }

    public static void main(String[] args) {
        Childs ch = new Childs();
        ch.show();
        ch.show("Vivek Anand");
    }
}
