class Car {
    int speed;
    String color;

    public static void main(String[]args){
        Car c1 = new Car();
        c1.speed=170;
        c1.color="Black";
        System.out.println(c1); // Reference value in hexadecimal
        System.out.println("Car color is :" + c1.color);
        System.out.println("Car speed is :" + c1.speed);
    }
}
