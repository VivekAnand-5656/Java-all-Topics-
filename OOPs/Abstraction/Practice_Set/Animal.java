package OOPs.Abstraction.Practice_Set;

abstract class Animal {
    abstract void makeSound();
}
class Dog extends Animal{
    void makeSound(){
        System.out.println("Dog is Barking.");
    }
}
class Cat extends Animal{
    void makeSound(){
        System.out.println("Cat is meou");
    }

    public static void main(String[] args) {
        Cat ct = new Cat();
        ct.makeSound();
        Dog dg = new Dog();
        dg.makeSound();
        Animal anm;
    }
}
