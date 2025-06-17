package OOPs.Abstraction.Practice_Set;

abstract class Vehicle {
    abstract void start();
}
class Car extends Vehicle{
    public void start(){
        System.out.println("Car starts with key");
    }
}
class Bike extends Vehicle{
    public void start(){
        System.out.println("Bike starts with kick");
    }

    public static void main(String[] args) {
        Car cr = new Car();
        cr.start();
        Bike br = new Bike();
        br.start();
    }
}
