package OOPs.Inheritance.Set_1;

public class NewAnimals {
    void eat(){
        System.out.println("Animal is eating...");
    }
}
class Cat extends NewAnimals{
    void eat(){
        System.out.println("Cat is eating...");
    }
    void sound(){
        System.out.println("Cat meows.");
    }

    public static void main(String[] args) {
        Cat obj = new Cat();
        obj.eat();
        obj.sound();
    }
}
