package OOPs.Inheritance.Set_1;

public class StudentResult {
    void display(){
        String name = "Vivek Anand";
        System.out.println("Name: "+name);
    }
}
class MarkSheet extends StudentResult{
    double math=55;
    double science = 60;
    double english = 80;
    double total;
    void display(){
        super.display();
        total= math+science+english;
        System.out.println("Total Marks: "+total);
    }
    public static void main(String[] args) {
        MarkSheet obj = new MarkSheet();
        obj.display();
    }
}
