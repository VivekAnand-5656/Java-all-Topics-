package Array;

import java.util.Scanner;

public class sorting {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter size:");
        int size = inp.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            System.out.printf("Element " + i +":");
            arr[i] = inp.nextInt();
        }
        // Decending Order
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i] < arr[j]){
                    int next = arr[i];
                    arr[i] = arr[j];
                    arr[j] = next;
                }
            }
        }
        System.out.println("Decending:-");
        for(int val:arr){
            System.out.printf(val + " ");
        }
        System.out.println();
        // Acending Order
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]>arr[j]){
                    int next = arr[i];
                    arr[i] = arr[j];
                    arr[j] = next;
                }
            }
        }
        System.out.println("Acending Order: ");
        for(int val:arr){
            System.out.printf(val + " ");
        }

    }
}
