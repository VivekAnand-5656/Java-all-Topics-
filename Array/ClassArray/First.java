package Array.ClassArray;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] marks = new int[5];
        for(int i=0;i<5;i++){
            System.out.println("Enter num: ");
            marks[i] = inp.nextInt();
        }
        for(int i=0;i<5;i++){
            System.out.println("Marks: "+marks[i]);
        }
    }
}
