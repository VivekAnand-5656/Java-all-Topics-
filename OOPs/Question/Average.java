package OOPs.Question;

import java.util.Scanner;

public class Average {
    public int avrg(int num){
        int sum=0;
        for(int i=1;i<=num;i++){
            sum+=i;
        }
        int avg = sum/num;
        return avg;
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Average av = new Average();
        System.out.println("Enter num: ");
        int num = inp.nextInt();
        int result = av.avrg(num);
        System.out.println("Average is: "+result);
    }
}
