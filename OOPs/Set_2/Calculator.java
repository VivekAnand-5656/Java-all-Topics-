package OOPs.Set_2;

import com.sun.security.jgss.GSSUtil;

public class Calculator {
    public int a;
    public int b;
    public int add(int num1,int num2){
        this.a=num1;
        this.b=num2;
        int sum = num1+num2;
        return sum;
    }
    public int sub(int num1,int num2){
        this.a=num1;
        this.b=num2;
        int subract = num1-num2;
        return subract;
    }
    public int multi(int num1,int num2){
        this.a=num1;
        this.b=num2;
        int multiply = num1*num2;
        return multiply;
    }
    public int devide(int num1,int num2){
        this.a=num1;
        this.b=num2;
        if(num2==0){
            System.out.println("Error");
            return 0;
        } else {
            int quotient = num1/num2;
            return quotient;
        }
    }
    public static void main(String[] args) {
        Calculator fun = new Calculator();
        System.out.println("Addition: "+fun.add(10,5));
        System.out.println("Substract: "+fun.sub(50,20));
        System.out.println("Multiply: "+fun.multi(10,20));
        System.out.println("Quotient: "+fun.devide(10,4));

    }
}
