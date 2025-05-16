package Array;

import java.util.Scanner;

public class max_min {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        System.out.printf("Enter size: ");
        int size = inp.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter Element:");
            arr[i] = inp.nextInt();
        }
        for(int val: arr){
            System.out.println(val + " ");
        }
        int max = arr[0];
        int min = arr[0];
        for(int i=0;i<size;i++){
                if(max <= arr[i]){
                    max = arr[i];
                }
                if(min >= arr[i]){
                    min = arr[i];
                }
        }
        System.out.println("Max : " + max + " Min : " + min);
    }
}
