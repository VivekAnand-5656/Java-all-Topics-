package OOPs.Set_1;

import java.util.Scanner;

public class Employee {
    public String name;
    public int employeeID;
    public double salary;
    public String department;
    public void work(int hours){
        System.out.println(name + " Worked: "+hours+" hours.");
    }
    public void updateSalary(double newSalary){
        System.out.println("New salary of "+name+" is: "+newSalary);
    }
    public void showDetails(){
        System.out.println("Name: "+name+" ID: "+ employeeID+ " Salary: "+salary+" Department: "+department);
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Employee emp = new Employee();
        System.out.println("Enter Name: ");
        emp.name = inp.nextLine();
        System.out.println("Enter Department: ");
        emp.department = inp.nextLine();
        System.out.println("Enter ID: ");
        emp.employeeID = inp.nextInt();
        System.out.println("Enter Salary: ");
        emp.salary = inp.nextDouble();

        System.out.println("Enter work hour: ");
        int workHour = inp.nextInt();
        emp.work(workHour);
        System.out.println("Enter New Salary: ");
        double newSal = inp.nextDouble();
        emp.updateSalary(newSal);
        emp.showDetails();
    }
}
