package OOPs.Encapsulation;

public class CarWala {
    private String brand;
    private int speed;
    private int fuel;
    public void setBrand(String brand,int speed,int fuel){
        this.brand = brand;
        if(speed > 0 && speed <= 300){
            this.speed = speed;
        }
        if(fuel > 0 && fuel <=100){
            this.fuel = fuel;
        } else {
            System.out.println("Fuel Empty");
        }
    }
    public String getBrand(){
        return brand;
    }
    public int getSpeed(){
        return speed;
    }
    public int getFuel(){
        return fuel;
    }

}
