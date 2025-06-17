package OOPs.Abstraction.Practice_Set;

import java.util.Scanner;

abstract class Shape {
    abstract void area();
}
class Rectangle extends Shape{
    public double length;
    public double breadth;
    public double areaRectangle;
    public Rectangle(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter length: ");
        length = inp.nextDouble();
        System.out.println("Enter breadth: ");
        breadth = inp.nextDouble();
        if(length <= 0 && breadth <= 0){
            int i=0;
            while (length <= 0 && breadth <= 0){
                System.out.println("Enter valid  length: ");
                length = inp.nextDouble();
                System.out.println("Enter valid breadth: ");
                breadth = inp.nextDouble();
                i++;
            }
        }
    }
    public void area(){
        areaRectangle = length *breadth;
        System.out.println("Area of Rectangle: "+areaRectangle);
    }
}
class Circle extends Shape{
    public double side;
    public final double pi = 3.14;
    public double areaOfCircle;
    public Circle(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter side: ");
        side = inp.nextDouble();
        if(side <= 0){
            int i=0;
            while (side <= 0){
                System.out.println("Enter valid side: ");
                side = inp.nextDouble();
                i++;
            }
        }
    }

    public void area(){
        areaOfCircle = 2 * pi * Math.sqrt(side);
        System.out.println("Area of Circle: "+areaOfCircle);
    }

    public static void main(String[] args) {
        Rectangle ar = new Rectangle();
        ar.area();
        Circle cr = new Circle();
        cr.area();
    }
}
