package OOPs.Polymorphism.Set_1;

public class AnimalsNew {
    public void makeSound(){
        System.out.println("Animal makes sound..");
    }
}
class Dog extends AnimalsNew{
    public void makeSound(){
        System.out.println("Dog Barks");
    }
}
class Cat extends AnimalsNew{
    public void makeSound(){
        System.out.println("Cat meous");
    }

    public static void main(String[] args) {
        AnimalsNew dg = new Dog();
        dg.makeSound();
        AnimalsNew ct = new Cat();
        ct.makeSound();
    }
}
