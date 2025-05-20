package OOPs.Inheritance.Set_1;

public class Train {
    void run(){
        System.out.println("Train is running.");
    }
}
class Metro extends Train{
    void run(){
        System.out.println("Metro is running on electric track.");
    }

    public static void main(String[] args) {
        Metro obj = new Metro();
        obj.run();
    }
}
