package OOPs;

public class overloading {
    public void display(int num){
        System.out.println("Num : "+num);
    }
    public void display(String str){
        System.out.println("Name : "+str);
    }
    public static void main(String[] args) {
        overloading det = new overloading();
        det.display("Vivek Anand");
        det.display(25);
    }
}
