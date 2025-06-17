package Strings.String_Set_1;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = inp.nextLine();
        String strc = str;
        String store = "" ;
        for(int i=str.length()-1;i>=0;i--){
            store+=str.charAt(i);
        }
        if(strc.equals(store)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
