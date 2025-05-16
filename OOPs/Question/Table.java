package OOPs.Question;

import java.util.Scanner;

public class Table {
    public void table(int num){
        int tab = 0;
        for(int i=1;i<=10;i++){
            tab = num*i;
            System.out.println(num + " x " + i + " = " + tab);
        }
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Table tb = new Table();
        System.out.println("Enter num: ");
        int num = inp.nextInt();
        tb.table(num);
    }
}
