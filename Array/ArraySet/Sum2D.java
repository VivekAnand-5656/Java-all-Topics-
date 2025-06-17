package Array.ArraySet;

public class Sum2D {
    public static void main(String[] args) {
        int arr[][] = {{10,45,85},{96,85,36}};
        int sum=0;
        int multi=1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];
                multi*=arr[i][j];
            }
        }
        System.out.println("Sum is: "+sum);
        System.out.println("Multplication: "+multi);
    }
}
