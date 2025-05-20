package Array;

import java.util.Scanner;

public class SecondMax {
    int size;

    void secondMax(int size,int num){
        Scanner inp = new Scanner(System.in);
        this.size=size;
        int arr[] = new int[size];
        System.out.println("Enter element: ");
        for(int i=0;i<size;i++){
            System.out.printf("Enter num: ");
            arr[i]=inp.nextInt();
        }
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
        }
        System.out.println("Second Max: "+arr[size-num]);
        System.out.println("Second min: "+arr[num-1]);
    }

    public static void main(String[] args) {
        SecondMax sc = new SecondMax();
        sc.size=5;
        sc.secondMax(sc.size,2);

    }
}
