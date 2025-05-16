package LearnMath;

import java.util.Scanner;

public class Min {
    public int num1;
    public int num2;
    public int minFun(int a,int b){
        int minNum = Math.min(a,b);
        return minNum;
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Min mn = new Min();
        System.out.println("Enter First num: ");
        mn.num1 = inp.nextInt();
        System.out.println("Enter Second num: ");
        mn.num2= inp.nextInt();
        int result = mn.minFun(mn.num1,mn.num2);
        System.out.println("Minimum number is: "+result);
    }
}
