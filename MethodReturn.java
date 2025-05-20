public class MethodReturn {
    MethodReturn mt(){
        MethodReturn pt = new MethodReturn();
        int sum=0;
        for(int i=1;i<=10;i++){
            System.out.println("Num: "+i);
            sum+=i;
        }
        System.out.println("Sum: "+sum);
        return pt;
    }

    public static void main(String[] args) {
        MethodReturn n = new MethodReturn();
        n.mt();
    }
}
