import java.util.Scanner;

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter Employee name: ");
        String name = inp.nextLine();
        System.out.println("Enter Employee ID");
        int id = inp.nextInt();
        System.out.println("Enter Salary");
        double salary = inp.nextDouble();
        System.out.println("Employee Name: "+name);
        System.out.println("Employee ID: "+id);
        System.out.println("Employee Salary: "+salary);
    }
}
