package OOPs.Set_1;

import java.util.Scanner;

public class Car {
    public String brand;
    public String model;
    public int year;
    public double fuel;
//      Drive and check fuel
    public void drive(double distance){

       double total = distance*0.1;
        if(fuel>=total){
            fuel= fuel-total;
            System.out.println("Car Run : " + distance + " Km. Fuel Remaining : "+fuel+ " ltr.");
        } else {
            System.out.println("not enough fuel! " + fuel+ " ltr");
        }
    }
//    Refuel
    public void refuel(double liters){
        fuel+=liters;
        System.out.println("Available Fuel : " + fuel+" ltr.");
    }
//    Display
    public void displayInfo(){
        System.out.println("Brand: "+brand+" Model: "+model+" Year: "+year+ " Fuel: "+fuel+" ltr.");
    }

    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        Car det = new Car();
        System.out.println("Enter Brand: ");
        det.brand = inp.nextLine();
        System.out.println("Enter Model: ");
        det.model = inp.nextLine();
        System.out.println("Enter year: ");
        det.year = inp.nextInt();
        System.out.println("Enter fuel: ");
        det.fuel = inp.nextDouble();

        System.out.println("Enter Distance: ");
        double distance = inp.nextDouble();
        det.drive(distance);
        System.out.println("Refuel: ");
        double fuelLitr = inp.nextDouble();
        det.refuel(fuelLitr);
        det.displayInfo();
    }
}
