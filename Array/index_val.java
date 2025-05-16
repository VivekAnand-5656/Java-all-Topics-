package Array;

import java.util.Scanner;

public class index_val {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        System.out.printf("Enter size: ");;
        int size =  inp.nextInt();
        System.out.printf("Enter index: ");
        int ind = inp.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            System.out.printf("index " +(i+1) + ":");
            arr[i] = inp.nextInt();
        }
        for(int i=0;i<size;i++){
            if(i==ind){
                System.out.printf("Element: " + arr[i]);
            }
        }
    }
}
