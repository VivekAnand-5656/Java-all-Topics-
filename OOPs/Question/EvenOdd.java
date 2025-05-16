package OOPs.Question;

import java.util.Scanner;

public class EvenOdd {
    public void evenOdd(int num){
        for(int i=1;i<=num;i++){
            if(i%2==0){
                System.out.println(i + " Even.");
            } else {
                System.out.println(i + " Odd!");
            }
        }
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        EvenOdd ev = new EvenOdd();
        System.out.println("Enter num: ");
        int num = inp.nextInt();
        ev.evenOdd(num);
    }
}
