package Array;

import java.util.Scanner;

public class RepeatingElement {
    int size;
    void input(int arr[],int size){
        Scanner inp = new Scanner(System.in);
        this.size=size;
        System.out.println("Enter Element: ");
        for(int i=0;i<size;i++){
            System.out.printf("Enter nums: ");
            arr[i] = inp.nextInt();
        }
    }
    void output(int arr[],int size){
        this.size=size;
        int count =0;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]==arr[j]){
                   count++;
                }
            }
            if(count>=1){
                System.out.println("First Repeating element: "+arr[i]);
                break;
            }
        }
    }

    public static void main(String[] args) {
        RepeatingElement rr = new RepeatingElement();
        rr.size=10;
        int arr[] = new int[rr.size];
        rr.input(arr,rr.size);
        rr.output(arr,rr.size);
    }
}
