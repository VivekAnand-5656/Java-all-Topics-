package Pattern;

import java.util.*;

//        * # *# *
//        * # *# *
//        * # *# *
//        * # *# *
public class patt_1 {
    void patt(){
        Scanner inp = new Scanner(System.in);
        System.out.printf("Enter num:");
        int num = inp.nextInt();

        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                if(j%2==0){
                    System.out.printf("*");
                } else {
                    System.out.printf("#");
                }
            }
            System.out.printf("\n");
        }
    }
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        patt_1 obj = new patt_1();
        obj.patt();
    }
}
