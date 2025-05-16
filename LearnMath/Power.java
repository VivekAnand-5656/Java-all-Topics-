package LearnMath;

import java.util.Scanner;

public class Power {
    public double base;
    public double pow;
    public double powerFun(double base,double pow){
        double powerNum = Math.pow(base,pow);
        return powerNum;
    }
    public static void main(String[] args) {
        Power px = new Power();
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter Base: ");
        px.base = inp.nextInt();
        System.out.println("Enter Power: ");
        px.pow = inp.nextInt();
        double result = px.powerFun(px.base, px.pow);
        System.out.println("Power of "+ px.base + " : "+result);
    }
}
