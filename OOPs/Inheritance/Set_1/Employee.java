package OOPs.Inheritance.Set_1;

public class Employee {
    String name = "Karan Kumar";
    void displayInfo(){
        System.out.println("Name: "+name);
    }
}
class Manager extends Employee{
    String department = "HR";
    void displayInfo(){
        super.displayInfo();
        System.out.println("Department: "+department);
    }

    public static void main(String[] args) {
        Manager obj = new Manager();
        obj.displayInfo();
    }
}
