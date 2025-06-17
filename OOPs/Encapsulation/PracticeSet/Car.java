package OOPs.Encapsulation.PracticeSet;

import java.util.Scanner;

public class Car {
    private String model;
    private int year;
    private double price;
    public void setModel(String model, int year, double price){
        this.model = model;
        if(year > 0){
            this.year = year;
        }
        if(price > 0){
            this.price = price;
        }
    }
    public String getModel(){
        return  model;
    }
    public int getYear(){
        return year;
    }
    public double getPrice(){
        return price;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter Model Name: ");
        String model = inp.nextLine();
        System.out.println("Enter Year: ");
        int year = inp.nextInt();
        System.out.println("Enter Price: ");
        double price = inp.nextDouble();

        Car car = new Car();
        car.setModel(model,year,price);
        System.out.println("Model: "+car.getModel());
        System.out.println("Year: "+car.getYear());
        System.out.println("Price: "+car.getPrice());
    }

}
