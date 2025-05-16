package OOPs;

public class parametrize {
    void sum(int a, int b){
        int c=a+b;
        System.out.println("Sum : "+c);
    }
    int sub(int n1,int n2){
        int su = n1-n2;
        return su;
    }
    int sqr(int num){
        return num*num;
    }
    public static void main(String[] args) {
        parametrize pm = new parametrize();
        pm.sum(25,25);
        int result = pm.sub(50,20);
        System.out.println("Sub : "+result);
        int square = pm.sqr(5);
        System.out.println("Square of num : "+square);
    }
}
