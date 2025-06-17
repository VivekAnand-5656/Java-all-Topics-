package Array.ArraySet;

import Array.Max;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = inp.nextInt();

        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter value: ");
            int num = inp.nextInt();
            arr[i] = num;
        }
        int max = arr[1];
        for(int i=0;i<size;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Max: "+max);
    }
}
