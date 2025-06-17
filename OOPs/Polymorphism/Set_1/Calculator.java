package OOPs.Polymorphism.Set_1;

public class Calculator {
    public void add(int num1,int num2){
        int sum = num1+num2;
        System.out.println("Sum of Two numbers: "+sum);
    }
    public void add(int num1,int num2,int num3){
        int sum = num1+num2+num3;
        System.out.println("Sum of three numbers: "+sum);
    }

    public static void main(String[] args) {
        Calculator res = new Calculator();
        res.add(10,50);
        res.add(10,50,60);
    }
}
