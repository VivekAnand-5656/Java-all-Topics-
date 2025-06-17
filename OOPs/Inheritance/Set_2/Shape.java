package OOPs.Inheritance.Set_2;

import OOPs.Encapsulation.PracticeSet.Rectangle;

public class Shape {
    public void area(){
        System.out.println("Shapes");
    }
}
class Circle extends Shape{
    double side = 10;
    final double pi = 3.14;
    public void area(){
        double areaCircle = pi * side*side;
        System.out.println("Area of Circle: "+areaCircle);
    }
}
class Rectangel extends Shape{
    int heihgt = 10;
    int width = 20;
    public void area(){
        int areaRect = heihgt*width;
        System.out.println("Area of Rectangel: "+areaRect);
    }

    public static void main(String[] args) {
        Circle cir = new Circle();
        cir.area();
        Rectangel rec = new Rectangel();
        rec.area();
    }
}
