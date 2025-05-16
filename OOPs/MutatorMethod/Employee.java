package OOPs.MutatorMethod;

public class Employee {
    private String name;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Vivek Anand");
        System.out.println("Employee name: "+emp.getName());
    }
}
