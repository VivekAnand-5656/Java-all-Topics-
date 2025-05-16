package OOPs.Constructor;

public class FirstConstruct {
    public String name;
    public int id;
    FirstConstruct (String name,int id){
        this.name=name;
        this.id=id;
        System.out.println("Name: "+name+" ID: "+id);
    }
    public static void main(String[] args) {
        FirstConstruct c1 = new FirstConstruct("Vivek Anand",101);
        FirstConstruct c2 = new FirstConstruct("Satyam Kumar",105);
    }
}
