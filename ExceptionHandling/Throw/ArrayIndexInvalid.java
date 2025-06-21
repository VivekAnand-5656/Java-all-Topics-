package ExceptionHandling.Throw;

public class ArrayIndexInvalid {
    public static void arrayCheck(int arr[],int ind){
        if(ind >= arr.length){
            throw new ArrayIndexOutOfBoundsException("Out of bond");
        }
        System.out.println(arr[ind]);
    }

    public static void main(String[] args) {
        int arr[] = {10,50,20};
        arrayCheck(arr,21);
    }
}
