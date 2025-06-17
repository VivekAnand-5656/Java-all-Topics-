package Array;

import java.util.Scanner;
// String array Deletion
public class Delt {
    private int size;
    private String arr[] = new String[size];
    public void setSize(String arr[],int size){
        this.arr = arr;
        this.size = size;
    }
    public void input(){
        Scanner inp = new Scanner(System.in);
        for(int i=0;i<size;i++){
            System.out.println("Enter Data: ");
            arr[i] = inp.nextLine();
        }
    }
    public void delet(){
        int pos = 2;
        for(int i=pos-1;i<size-1;i++){
            arr[i] = arr[i+1];
        }
        for(int i=0;i<size-1;i++){
            System.out.printf(arr[i] +" ");
        }
    }

    public static void main(String[] args) {
        Delt boj = new Delt();
        int size =5;
        String arr[] = new String[size];
        boj.setSize(arr,size);
        boj.input();
        boj.delet();
    }
}
