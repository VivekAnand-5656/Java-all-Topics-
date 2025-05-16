package Array;

import java.util.Scanner;

public class delete {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        System.out.printf("Ener Size: ");
        int size = inp.nextInt();
        System.out.printf("Enter position: ");
        int pos = inp.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            System.out.printf("Element: ");
            arr[i] = inp.nextInt();
        }
        for(int i=pos-1;i<size-1;i++){
            arr[i]=arr[i+1];
        }
        for(int i=0;i<size-1;i++){
            System.out.printf(arr[i] + " ");
        }
    }
}
