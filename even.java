import java.util.Scanner;

public class even {
    public static void main(String []args){
        Scanner inp = new Scanner(System.in);
        System.out.printf("Enter num:");
        int num = inp.nextInt();
        if(num%2==0){
            System.out.printf("Even number!");
        } else {
            System.out.printf("Odd number!");
        }
    }
}
