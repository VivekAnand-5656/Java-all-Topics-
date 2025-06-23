import java.util.Scanner;

// Class defination
public class EmployeeDetails {
    int id;
    String name;

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
    public static void main(String[] args) {
        // Create object of Employee
        EmployeeDetails emp = new EmployeeDetails();
        emp.id = 1;
        emp.name = "Vivek";

        // Call method
        emp.display();

    }
}
