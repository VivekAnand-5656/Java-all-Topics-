package Array;

import java.util.Scanner;

public class Deletion {
    int size;
    void input(int arr[],int size){
        Scanner inp = new Scanner(System.in);
        this.size=size;

        System.out.println("Enter Element: ");
        for(int i=0;i<size;i++){
            System.out.print("Enter num: ");
            arr[i]=inp.nextInt();
        }
    }
    void output(int arr[],int size){
        this.size=size;
        int pos=2;
        for(int i=pos-1;i<size-1;i++){
            arr[i]=arr[i+1];
        }
        for(int i=0;i<size-1;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Deletion ar = new Deletion();
        ar.size = 5;
        int arr[] = new int[ar.size];
        ar.input(arr,ar.size);
        ar.output(arr,ar.size);
    }
}
