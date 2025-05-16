package Array;

import java.util.Scanner;

public class avg_Odd {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        System.out.printf("Enter size: ");
        int size = inp.nextInt();
        int arr[] = new int[size];
        int sumEven = 0;
        int countEven = 0;

        int sumOdd = 0;
        int countOdd = 0;
        for(int i=0;i<size;i++){
            System.out.printf("Index " + (i+1) + ":");
            arr[i] = inp.nextInt();
        }
        for(int val:arr){
            System.out.printf(val + " ");
        }
        System.out.println();
        for(int i=0;i<size;i++){
            if(arr[i]%2==0){
                sumEven+=arr[i];
                countEven++;
            } else {
                sumOdd+=arr[i];
                countOdd++;
            }
        }
        int avgEven = sumEven/countEven;
        int avgOdd = sumOdd/countOdd;
        System.out.println("Sum Even : " + avgEven);
        System.out.println("Sum Odd : " + avgOdd
        );
    }
}
