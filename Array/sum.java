package Array;

import java.util.Scanner;

public class sum {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        System.out.printf("Enter Size:");
        int size = inp.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Index " + (i+1));
            arr[i] = inp.nextInt();
        }
        int sum = 0;
//        for(int i=0;i<size;i++){
//            sum = sum + arr[i];
//        }
        for(int val : arr){
            sum = sum+val;
        }
        System.out.println("Sum of array:" + sum);
    }
}
