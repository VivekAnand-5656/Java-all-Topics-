package Pattern;
// * # * # *
// # * # * #
// * # * # *
import java.util.Scanner;

public class patt_4 {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        System.out.printf("Enter num:");
        int num = inp.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if((i+j)%2==0){
                    System.out.printf("* ");
                } else{
                    System.out.printf("# ");
                }
            }
            System.out.printf("\n");
        }
    }
}
