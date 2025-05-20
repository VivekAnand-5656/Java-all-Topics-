package OOPs.Inheritance.Set_1;

public class Shapes {
    void perimeter(){
        System.out.println("Calculating Perimeter..");
    }
}
class Square extends Shapes{
    int side=7;
    void perimeter(){
        int peri = 4*side;
        System.out.println("Perimeter of Square: "+peri);
    }

    public static void main(String[] args) {
        Square obj = new Square();
        obj.perimeter();
    }
}
