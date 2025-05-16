package OOPs.Set_2;

public class ProductJavaBean {
    private int id;
    private String name;
    private double price;
    public void setName(int id,String name,double price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }

    public static void main(String[] args) {
        ProductJavaBean obj = new ProductJavaBean();
        obj.setName(102,"Book",256.50);
        System.out.println("ID: "+obj.getId());
        System.out.println("Name: "+obj.getName());
        System.out.println("Price: "+obj.getPrice());
    }
}
