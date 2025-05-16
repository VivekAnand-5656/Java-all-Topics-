package Test;

public class Rectangle {
    double length;
    double width;
    void setDimention(double l, double w){
        System.out.println("Length: "+l+" Width: "+w);
    }
    void area(){
        double ar= length*width;
        System.out.println("Area: "+ar);
    }
    boolean isSquare(){
        return length==width;
    }
    public static void main(String[] args) {
        Rectangle det = new Rectangle();
        det.length=20;
        det.width=10;
        det.setDimention(det.length,det.width);
        det.area();
        if(det.isSquare()){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
     }
}
