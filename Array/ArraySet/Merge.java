package Array.ArraySet;

import org.w3c.dom.ls.LSOutput;

public class Merge {
    public static void main(String[] args) {
        int arr[] = {10,45,85,96,36};
        int arr2[] = {55,65,91,36,95};
        int sorted[] = new int[arr.length+arr2.length];

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] > arr[j]){
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        for(int i=0;i<arr2.length;i++){
            for(int j=i+1;j<arr2.length;j++){
                if(arr2[i] > arr2[j]){
                    int tmp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = tmp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            sorted[i] = arr[i];
        }
        int k =0;
        for(int i=arr.length;i<arr2.length+arr.length;i++){
            sorted[i] = arr2[k];
            k++;
        }
        System.out.println("-----");
       for(int i=0;i<sorted.length;i++){
           System.out.println(sorted[i]);
       }
    }
}
