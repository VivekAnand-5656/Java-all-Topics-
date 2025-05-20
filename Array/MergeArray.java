package Array;

import java.util.*;

public class MergeArray {
    public int size;
    public void merge(int size){
        Scanner inp = new Scanner(System.in);
        this.size=size;
        int arr[] = new int[size];
        int arr2[] = new int[size];
        int arr3[] = new int[size+size];
        System.out.println("Enter Element: ");
        for(int i=0;i<size;i++){
            System.out.printf("Enter num: ");
            arr[i] = inp.nextInt();
        }
        System.out.println("Enter second Array Element: ");
        for(int i=0;i<size;i++){
            System.out.printf("Enter num: ");
            arr2[i] = inp.nextInt();
        }
        for(int i=0;i<size;i++){
            arr3[i]=arr[i];
        }
        int s=0;
        for(int i=size;i<size+size;i++){
            arr3[i]=arr2[s];
            s++;
        }
        for(int i=0;i<size+size;i++){
            System.out.print(arr3[i]+" ");
        }
    }

    public static void main(String[] args) {
        MergeArray m = new MergeArray();
        m.size=5;
        m.merge(m.size);
    }
}
