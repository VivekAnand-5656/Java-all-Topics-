package Array;

import java.util.Scanner;

public class reverse {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        System.out.printf("Enter size: ");
        int size = inp.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter Element: ");
            arr[i] = inp.nextInt();
        }
        for(int value : arr){
            System.out.print(value + " ");
        }
        System.out.println();
        for(int i=size-1;i>=0;i--){
            System.out.print(arr[i] + " ");
        }
    }
}
