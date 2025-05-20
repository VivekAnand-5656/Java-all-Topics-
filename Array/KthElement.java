package Array;

import java.util.Scanner;

public class KthElement {
    int size;
    void elment(int size,int position){
        Scanner inp = new Scanner(System.in);
        this.size=size;
        int arr[]=new int[size];
        System.out.println("Enter Element: ");
        for(int i=0;i<size;i++){
            System.out.print("Enter num: ");
            arr[i]=inp.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(position+"th Element: "+arr[position-1]);

    }

    public static void main(String[] args) {
        KthElement kt = new KthElement();
        kt.size=5;
        kt.elment(kt.size,2);
    }
}
