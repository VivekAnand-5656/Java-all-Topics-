 class PrivateExample {
    private int speed;
    private String color;
    private void run(){
        System.out.println("Color is: " + color + " and speed : " +speed);
    }

     public static void main(String[] args) {
         PrivateExample car = new PrivateExample();
         car.speed = 180;
         car.color = "Blue";
         car.run();
     }
}
