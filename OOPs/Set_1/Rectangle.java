package OOPs.Set_1;

import java.util.Scanner;

public class Rectangle {
    double length;
    double width;

    void calculateArea(){
        double area = length*width;
        System.out.println("Area of rectangel: "+area);
    }
    void calculatePerimeter(){
        double peri = 2*(length+width);
        System.out.println("Perimeter of rectangle: "+peri);
    }
    void displayDimention(){
        System.out.println("Length: "+length + " Width: "+width);
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Rectangle rec = new Rectangle();
        System.out.println("Enter length: ");
        rec.length = inp.nextDouble();
        System.out.println("Enter width: ");
        rec.width = inp.nextDouble();
        rec.calculateArea();
        rec.calculatePerimeter();
        rec.displayDimention();
    }
}
