package OOPs.Overloading.Sets;

public class AreaCalculator {
    double area(int radius){
        double circle =  3.14*radius*radius;
        return circle;
    }
    int area(int length,int width){
        int rectangle = length*width;
        return rectangle;
    }
    double area(double base,double height){
        double triangle = 0.5*base*height;
        return triangle;
    }

    public static void main(String[] args) {
        AreaCalculator ar = new AreaCalculator();
        System.out.println("Area of Circle: "+ar.area(5));
        System.out.println("Area of Rectangle: "+ar.area(10,30));
        System.out.println("Area of Triangle: "+ar.area(15.0,5.0));
    }
}
