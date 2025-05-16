package Pattern;

import java.util.Scanner;

//abc
//def
//ghi
public class patt_3 {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        System.out.printf("Enter num:");
        int num = inp.nextInt();
//        char ch = inp.next().charAt(0);
        char ch = 'a';
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.printf("\n");
        }
    }
}
