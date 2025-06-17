package OOPs.Polymorphism.Set_1;

public class Printer {
    public void print(String name,int num,double size){
        System.out.println("Customer name "+name);
        System.out.println("Print Size: "+size);
        System.out.println("Print pages: "+num);
    }
    public void print(int num,double size,String name){
        System.out.println("Customer name: "+name);
        System.out.println("Print Size: "+size);
        System.out.println("Print pages: "+num);
    }
    public void print(double size,String name,int num){
        System.out.println("Customer name: "+name);
        System.out.println("Print Size: "+size);
        System.out.println("Print pages: "+num);
    }

    public static void main(String[] args) {
        Printer data = new Printer();
        data.print(2.3,"Vivek Anand",4);
        data.print(5,2.3,"Rajiv Kumar");
        data.print("Satyam Kumar",6,2.3);
    }
}
