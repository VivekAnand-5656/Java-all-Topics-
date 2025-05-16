package Pattern;

import java.util.Scanner;

public class patt_6 {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        System.out.printf("Enter char:");
        char ch = inp.next().charAt(0);
        char alpha ='a';
        for(char i = 'a';i<=ch;i++){
            for(char j='a';j<=i;j++){
                System.out.print(alpha);
                alpha++;
            }
            System.out.printf("\n");
        }
    }
}
