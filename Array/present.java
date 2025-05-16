package Array;

import java.util.Scanner;

public class present {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        System.out.printf("Enter size: ");
        int size = inp.nextInt();
        System.out.printf("Enter num: ");
        int num = inp.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            System.out.printf("Element : ");
            arr[i] = inp.nextInt();
        }
        int count =0;
        for(int i=0;i<size;i++){
            if(arr[i]==num){
                count++;
            }
        }
        if(count>0){
            System.out.println(num + " Present!");
        }else {
            System.out.println(num + " Not Present!");
        }
    }
}
