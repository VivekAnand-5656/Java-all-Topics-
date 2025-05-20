package OOPs.Inheritance.Set_1;

public class LivingBeing {
    void breathe(){
        System.out.println("Breathing...");
    }
}
class Animals extends LivingBeing{
    void eat(){
        System.out.println("Eating....");
    }
}
class Dogs extends Animals{
    void bark(){
        System.out.println("Barking....");
    }

    public static void main(String[] args) {
        Dogs obj = new Dogs();
        obj.breathe();
        obj.eat();
        obj.bark();
    }
}
