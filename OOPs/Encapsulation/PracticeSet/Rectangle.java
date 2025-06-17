package OOPs.Encapsulation.PracticeSet;

public class Rectangle {
    private double length;
    private double breadth;
    public void setLength(double length,double breadth){
        if(length > 0){
            this.length = length;
        }
        if(breadth > 0){
            this.breadth = breadth;
        }
    }
    public double getLength(){
        return length;
    }
    public double getBreadth(){
        return breadth;
    }
    public double areaRectangle(){
        return length*breadth;
    }
    public double perimeter(){
        return 2*(length+breadth);
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setLength(20,50);
        System.out.println("Area of Rectangle: "+rect.areaRectangle());
        System.out.println("Perimeter of Rectangle: "+rect.perimeter());
    }
}
