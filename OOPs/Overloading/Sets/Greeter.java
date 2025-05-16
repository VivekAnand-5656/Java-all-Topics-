package OOPs.Overloading.Sets;

public class Greeter {
    void greet(){
        System.out.println("Hello!");
    }
    void  greet(String name){
        System.out.println("Hello "+name);
    }
    void greet(String time,String name){
        System.out.println("Good "+time+" "+name);
    }

    public static void main(String[] args) {
        Greeter gt = new Greeter();
        gt.greet();
        gt.greet("Vivek Anand");
        gt.greet("Morning","Vivek Anand");
    }
}
