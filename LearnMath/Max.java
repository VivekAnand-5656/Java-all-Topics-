package LearnMath;

import java.util.Scanner;

public class Max {
    public float num1;
    public float num2;
    public float maxFun(float num1,float num2){
        float maxNum = Math.max(num1,num2);
        return maxNum;
    }
    public static void main(String[] args) {
        Max mx = new Max();
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter First num: ");
        mx.num1 = inp.nextInt();
        System.out.println("Enter Second num: ");
        mx.num2 = inp.nextInt();
        float result = mx.maxFun(mx.num1, mx.num2);
        System.out.println("Maximum number is: "+result);
    }
}
