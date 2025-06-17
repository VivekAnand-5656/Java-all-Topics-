package OOPs.Inheritance.Set_2;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Vehicle {
    String brand;
    double speed;

}
class Car extends Vehicle{
    Scanner inp = new Scanner(System.in);
    String fuelType;

    public void setFuelType(){
        System.out.println("Enter brand: ");
        super.brand = inp.nextLine();
        System.out.println("Enter speed: -");
        super.speed = inp.nextDouble();
        inp.nextLine();
        System.out.println("Enter type of fuel:- ");
        fuelType = inp.nextLine();
    }
    public void displayDetail(){
        System.out.println("Brand: "+brand);
        System.out.println("Speed: "+speed);
        System.out.println("FuelType: "+fuelType);
        if(speed > 200){
            System.out.println("High Speed");
        } else {
            System.out.println("Normal Speed");
        }
    }

    public static void main(String[] args) {
        Car obj = new Car();
        obj.setFuelType();
        obj.displayDetail();
    }
}