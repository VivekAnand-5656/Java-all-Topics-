package OOPs.Inheritance.Set_1;

public class Food {
    String foodName = "Gulab Jamun";
    void display(){
        System.out.println("Food: "+foodName);
    }
}
class Desert extends Food{
    String sweetnessLevel = "High";
    void display(){
        super.display();
        System.out.println("Sweetness Level: "+sweetnessLevel);
    }

    public static void main(String[] args) {
        Desert obj = new Desert();
        obj.display();
    }
}
