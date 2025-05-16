package OOPs.Overloading.Sets;

// Parent class
public class Animal {
    void makeSound(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog barks.");
    }
}
class Cat extends Animal{
    void mew(){
        System.out.println("Cat meows.");
    }

    public static void main(String[] args) {
        Dog dg = new Dog();
        Cat ct = new Cat();
        dg.makeSound();
        dg.bark();
        ct.mew();
    }
}