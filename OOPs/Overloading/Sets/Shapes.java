package OOPs.Overloading.Sets;

public class Shapes {
    void printShape(){
        System.out.println("This is a Shape!");
    }
}
class Square extends Shapes{
    void printShape(){
        System.out.println("This is a square!");
    }
}
class Rectangles extends Shapes{
    void printShape(){
        System.out.println("This is a Rectangle!");
    }

    public static void main(String[] args) {
        Rectangles rc = new Rectangles();
        Square sq = new Square();
        rc.printShape();
        sq.printShape();
    }
}
