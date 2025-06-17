package OOPs.Inheritance.Set_2;

import OOPs.Inheritance.Bird;

public class Birds {
    public void fly(){
        System.out.println("Birds fly...");
    }
}
class Penguin extends Birds{
    public void fly(){
        System.out.println("Penguin can't fly");
    }

    public static void main(String[] args) {
        Penguin obj = new Penguin();
        obj.fly();
    }
}
