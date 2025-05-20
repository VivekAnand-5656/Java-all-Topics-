public class Practice {
    Practice pr (){
        Practice p = new Practice();
        int a=5,b=10;
        int sum = a+b;
        System.out.println("Sum: "+sum);
          return p;
    }
    public static void main(String[] args) {
        Practice pr = new Practice();
        pr.pr();
    }
}
