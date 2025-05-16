package Pattern;

import java.util.Scanner;

//123
//456
//789
public class patt2 {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        System.out.printf("Enter num:");
        int num = inp.nextInt();
        int number=1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                System.out.print(number);
                number++;
            }
            System.out.printf("\n");
        }
    }
}
