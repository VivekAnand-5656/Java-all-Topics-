package Test;

public class Today {
    public static void main(String[] args) {
        int arr[] = {10,50,86,45,86};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        int max =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > arr[i+1]){
                max = arr[i+1];
                break;
            }
        }
        System.out.println("Second max: "+max);
    }
}
