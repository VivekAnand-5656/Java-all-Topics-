package Array;

import java.util.Scanner;

public class store1or0 {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        System.out.printf("Enter size: ");
        int size = inp.nextInt();
        int arr[] = new int[size];
        int num;

        for(int i=0;i<size;){
            System.out.printf("Element " + (i+1) + ":");
            num = inp.nextInt();
            if(num==0 || num==1){
                arr[i]=num;
                i++;
            }
        }
        for(int val:arr){
            System.out.printf(val + " ");
        }
    }
}
