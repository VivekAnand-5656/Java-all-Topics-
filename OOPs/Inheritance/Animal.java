package OOPs.Inheritance;

public class Animal { // parrent class
    void makeSound(){
        System.out.println("Animal makes sound!");
    }
}

class Dog extends Animal{ // child class
    void run(){
        System.out.println("Dog is running.");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();
        d.run();
    }
}
