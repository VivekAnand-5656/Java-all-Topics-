package Pattern;

import java.util.Scanner;

//1
//23
//456
public class patt_5 {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        System.out.printf("Enter num:");
        int num = inp.nextInt();
        int a=1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a);
                a++;
            }
            System.out.printf("\n");
        }
    }
}
