package ExceptionHandling.Throws;

public class ArrayChecking {
    public static void  checking(int arr[],int index) throws ArithmeticException{
        System.out.println("Index: "+index+" value : "+arr[index]);
    }

    public static void main(String[] args) {
        int arr[] = {10,50,20,30};
        try {
            checking(arr,10);
        } catch (ArrayIndexOutOfBoundsException check){
            System.out.println(check.getMessage());
        }
    }
}
