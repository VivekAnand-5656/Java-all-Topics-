package OOPs.Super;

public class Parent {
   String name = "Parent Class";
}
class Beta extends Parent{
    void meth(){
//        super.meth(); // Call Parent
        String name = "Child Class";
        System.out.println("Parrent: "+super.name);
        System.out.println("Child Name: " +name);
    }

    public static void main(String[] args) {
        Beta bt = new Beta();
        bt.meth();
    }
}
