package ExceptionHandling;

public class Cword {
    public static void main(String[] args) {
        int[] arr = {10,50,20,50,50,60,60};
        try{
            for(int i=0;i<10;i++){
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException check){
            System.out.println("Array index is out of bonds");
        }

        int num = 10;
        int num2 = 0;
        try {
            int res = num/num2;
            System.out.println(res);
        } catch (Exception check){
            System.out.println("Code Error");
        }
    }
}
