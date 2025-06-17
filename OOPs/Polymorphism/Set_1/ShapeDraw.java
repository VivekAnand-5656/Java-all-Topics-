package OOPs.Polymorphism.Set_1;

import OOPs.Inheritance.Set_2.Shape;

public class ShapeDraw {
    public void draw(){
        System.out.println("Draw with shapes");
    }
}
class CircleDraw extends ShapeDraw{
    public void draw(){
        System.out.println("Draw through Circle");
    }
}
class RectangleDraw extends ShapeDraw{
    public void draw(){
        System.out.println("Draw through Rectangle");
    }
}
class TriangleDraw extends ShapeDraw{
    public void draw(){
        System.out.println("Draw through Triangle");
    }

    public static void main(String[] args) {
        ShapeDraw cc = new CircleDraw();
        cc.draw();
        ShapeDraw rc = new RectangleDraw();
        rc.draw();
        ShapeDraw tc = new TriangleDraw();
        tc.draw();
    }
}
