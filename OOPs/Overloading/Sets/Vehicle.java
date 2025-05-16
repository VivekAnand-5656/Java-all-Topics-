package OOPs.Overloading.Sets;

public class Vehicle {
    void displayInfo(){
        System.out.println("Generic Vehicle.");
    }
}
class Car extends Vehicle{
    void displayInfo(){
        System.out.println("Car : 4 wheels");
    }
}
class Bike extends Vehicle{
    void displayInfo(){
        System.out.println("Bike : 2 wheels");
    }

    public static void main(String[] args) {
        Vehicle vh = new Vehicle();
        Car cr = new Car();
        Bike br = new Bike();
        vh.displayInfo();
        cr.displayInfo();
        br.displayInfo();
    }
}
