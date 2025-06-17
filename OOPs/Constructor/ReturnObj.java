package OOPs.Constructor;

// this to Return Current Object (Method Chaining)
public class ReturnObj {
    String name;
    ReturnObj setName(String name){
        this.name=name;
        return this;
    }
    void display(){
        System.out.println("Name: "+name);
    }

    public static void main(String[] args) {
        new ReturnObj().setName("Vivek").display();
    }
}
