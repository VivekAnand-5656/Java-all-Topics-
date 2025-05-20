public class Return {
    Return m1(){
        Return m1 = new Return();
        return m1;
    }
    public static void main(String[] args) {
        Return n = new Return();
        System.out.println("Hexa "+n.m1());
        Return a,b;
        a=new Return();
        System.out.println(a);

    }
}
