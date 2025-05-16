package OOPs.Overloading;

public class Calculator {
    int add(int a,int b){
        return a+b;
    }
    double add(double a,double b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Add: "+calc.add(5,5));
        System.out.println("Add: "+calc.add(2.5,5.6));
        System.out.println("Add: "+calc.add(6,10,100));
    }
}
