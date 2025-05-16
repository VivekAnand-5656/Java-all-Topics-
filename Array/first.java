package Array;

import java.util.Scanner;

public class first {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        System.out.printf("Enter size:");
        int size = inp.nextInt();
        int arr[] = new int[size];
        System.out.println("Element:");
        for(int i=0;i<size;i++){
            System.out.printf((i+1) + " Index: ");
            arr[i] = inp.nextInt();
        }
        System.out.println("Elements:-");
        for(int i=0;i<size;i++){
            System.out.printf(arr[i] + " ");
        }
    }
}
