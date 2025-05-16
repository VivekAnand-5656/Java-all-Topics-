   class NewCar {
    int speed;
    String color;

    void accelerate(){
        speed = speed+10;
        System.out.println("Car color is: "+color + " and accelerating speed is: " + speed);
    }
    public static void main(String[] args) {
        NewCar c1 = new NewCar();
        c1.color = "Black";
        c1.speed = 180;
        c1.accelerate();
    }
}
