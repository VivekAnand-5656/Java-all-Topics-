package Loops;

public class VarExamples {
    int a=15;
    static int b;
    public void run(){
        int c=12;
        System.out.println("Value is :" +a);
    }
    public void display(){
        int d = 13;
        System.out.println("Value is :" +d);
        System.out.println("Value is :" +a);
    }
    public static void main(String[] args){
        VarExamples ve = new VarExamples();
        ve.run();
    }
}
