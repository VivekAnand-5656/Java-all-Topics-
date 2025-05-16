package LearnMath;

import java.util.*;

public class Square {
    public double num;
    public double root(double num){
        return Math.sqrt(num);
    }
    public static void main(String[] args) {
        Square sq = new Square();
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter num: ");
        sq.num = inp.nextInt();
        double result = sq.root(sq.num);
        System.out.println("Square root of "+sq.num+" : "+result);
    }
}
