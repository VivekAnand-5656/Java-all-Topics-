package Test;

public class SimpleCalculator {
    public int add(int a,int b){
        int sum=a+b;
        return sum;
    }
    public int multiply(int a,int b){
        int multi = a*b;
        return multi;
    }
    public boolean isEven(int result){
        return result%2==0;
    }

    public static void main(String[] args) {
        SimpleCalculator cal = new SimpleCalculator();
        int a=5;
        int b=10;
        int res = cal.add(a,b);
        System.out.println("Add: "+res);
        int mul = cal.multiply(a,b);
        System.out.println("Multiply: "+mul);
        if(cal.isEven(res)){
            System.out.println("Even!");
        }else {
            System.out.println("Odd!");
        }

    }

}
