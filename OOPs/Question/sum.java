package OOPs.Question;

import java.util.Scanner;

public class sum {
    public int sumNum(int num,int num2){
        int add = num+num2;
        return add;
    }
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        sum sm = new sum();
        System.out.printf("Enter First num: ");
        int a = inp.nextInt();
        System.out.printf("Enter Second num: ");
        int b = inp.nextInt();
        int result = sm.sumNum(a,b);
        System.out.println("Sum of a and b is :"+result);
    }
}
