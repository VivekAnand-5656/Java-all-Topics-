package OOPs.Inheritance.Set_1;

public class Shape {
    void area(){
        System.out.println("Calculating area....");
    }
}
class Rectangle extends Shape{
    int length;
    int bredth;
    void area(){
        int areaCalculat = length*bredth;
        System.out.println("Area of Rectangle: "+areaCalculat);
    }

    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        obj.length=10;
        obj.bredth=20;
        obj.area();
    }
}
