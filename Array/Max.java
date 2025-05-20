package Array;

import java.util.Scanner;

public class Max {
    int size;
    public void max(int size){
        Scanner inp = new Scanner(System.in);
        this.size=size;
        int arr[] = new int[size];
        System.out.println("Enter element: ");
        for(int i=0;i<size;i++){
            System.out.printf("Num: ");
            arr[i]=inp.nextInt();
        }
        int max=arr[0];
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(max<=arr[i]){
                    max=arr[i];
                }
            }
        }
        System.out.println("Max: "+max);
    }

    public static void main(String[] args) {
        Max m = new Max();
        m.size=5;
        m.max(m.size);
    }
}
