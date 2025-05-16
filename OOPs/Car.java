package OOPs;

public class Car {
    String brand;
    int year;
    String color;
    void run(){
        System.out.println("Brand : "+brand + " , Year : "+year + " ,Color : " + color);
    }
    public static void main(String[]args){
        Car c1 = new Car();
        c1.brand = "Mahindra";
        c1.year = 2025;
        c1.color = "Black";
        c1.run();
    }
}
