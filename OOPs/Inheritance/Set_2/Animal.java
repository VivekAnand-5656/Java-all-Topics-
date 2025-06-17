package OOPs.Inheritance.Set_2;

public class Animal {
    void makeSound(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal{
    void makeSound(){
        System.out.println("Dog Barks");
    }

    public static void main(String[] args) {
        Dog sound = new Dog();
        sound.makeSound();
    }
}
