package OOPs;

public class passValue {
    public void swap(int a,int b){
       a=a+b;
       b=a-b;
       a=a-b;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
    public static void main(String[] args) {
        passValue sw = new passValue();
        int x=15;
        int y=10;
        System.out.println("x :" +x +" y :"+y);
        sw.swap(x,y);
        System.out.println("Swap x :" +x +" y :"+y);
    }
}
