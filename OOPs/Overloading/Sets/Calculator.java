package OOPs.Overloading.Sets;

public class Calculator {
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum of a and b: "+calc.add(5,10));
        System.out.println("Sum of a,b and c: "+calc.add(5,9,8));
    }
}
