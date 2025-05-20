package OOPs.MethodModifier;

public class MethodModifier {
    static final void show(){          // Static final combination
        System.out.println("Static Final Method.");
    }
    static synchronized void show(String boy){ // Static synchronized combination
        System.out.println(boy);
    }
    final synchronized void display(){ // final synchronized combination
        System.out.println("Hello Boss");
    }


    public static void main(String[] args) {
        MethodModifier mf = new MethodModifier();
        MethodModifier.show();
        MethodModifier.show("Vivek");
        mf.display();
    }
}