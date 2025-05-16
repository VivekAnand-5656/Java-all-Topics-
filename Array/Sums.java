package Array;

public class Sums {
    public int sumNum(){
        int arr[]={5,6,8,1,3};
        int sum=0;
        for(int vr:arr){
            sum+=vr;
        }
        return sum;
    }
    public static void main(String[] args) {
        Sums add = new Sums();
        System.out.println("Sum of Array: "+add.sumNum());
    }
}
