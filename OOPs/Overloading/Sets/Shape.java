package OOPs.Overloading.Sets;


public class Shape {
    void draw(){
        System.out.println("Drawing shape.");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Drawing Circle.");
    }
    void draw(int radious){
        System.out.println("Drawing Circle of radious: "+radious);
    }
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("Drawing Rectangle.");
    }

    public static void main(String[] args) {
        Circle cr = new Circle();
        Rectangle re = new Rectangle();
        cr.draw();
        cr.draw(5);
        re.draw();
    }
}
