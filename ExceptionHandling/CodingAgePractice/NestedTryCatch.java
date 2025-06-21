package ExceptionHandling.CodingAgePractice;

public class NestedTryCatch {
    public static void checking(int arr[],int ind){
        int divi = 2;
        try {
            System.out.println(arr[ind]);
            try {
                int result = arr[ind] / divi;
                System.out.println("Result: "+result);
            } catch (ArithmeticException ch){
                System.out.println("0 is not allowed for divisor");
            }
        } catch (ArrayIndexOutOfBoundsException ch){
            System.out.println(ch.getMessage());
        }
    }
    public static void main(String[] args) {
        int arr[] = {10,50,20,30,60};
        int ind = 2;
        checking(arr,ind);
    }
}
