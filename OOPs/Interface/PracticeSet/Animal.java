package OOPs.Interface.PracticeSet;

public interface Animal {
    void makeSound();
}
class Dog implements Animal{
    public void makeSound(){
        System.out.println("Dog barks");
    }
}
class Cat implements Animal{
    public void makeSound(){
        System.out.println("Cat meous");
    }

    public static void main(String[] args) {
        Dog dg = new Dog();
        dg.makeSound();
        Cat ct = new Cat();
        ct.makeSound();

    }
}
