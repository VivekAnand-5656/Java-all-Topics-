package Pattern;

import java.sql.SQLOutput;
import java.util.Scanner;

public class patt_7 {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        System.out.printf("Enter num:");
        int num = inp.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.printf("* ");
            }
            System.out.printf("\n");
        }
        int up = num-1;
        for(int i=1;i<=up;i++){
            for(int j=up;j>=i;j--){
                System.out.printf("* ");
            }
            System.out.printf("\n");
        }

    }
}
