package OOPs.Interface;

public interface Animal {
    int a =56;
    void makeSound();
}
class Dog implements Animal{
    public void makeSound(){
        System.out.println("Dog barks.");
    }

    public static void main(String[] args) {
        Dog dg = new Dog();
        dg.makeSound();
        System.out.println("A: "+a);
    }
}
