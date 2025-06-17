package OOPs.Encapsulation.PracticeSet;

import java.util.Scanner;

public class Employee {
    private String empName;
    private  int empID;
    private double salary;
    public void setEmpName(String empName,int empID,double salary){
        this.empName = empName;
        if(empID > 0){
            this.empID = empID;
        }
        if(salary > 10000){
            this.salary = salary;
        }
    }
    public String getEmpName(){
        return empName;
    }
    public int getEmpID(){
        return empID;
    }
    public double getSalary(){
        return salary;
    }
    public void display(){
        System.out.println("Employee Name: "+ getEmpName());
        System.out.println("Employee ID: "+ getEmpID());
        System.out.println("Employee Salary: "+getSalary());
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Employee emp = new Employee();
        System.out.println("Enter Employee Name: ");
        String name = inp.nextLine();
        System.out.println("Enter Employee ID: ");
        int id = inp.nextInt();
        System.out.println("Enter Employee Salary: ");
        double salary = inp.nextDouble();

        emp.setEmpName(name,id,salary);
        emp.display();
    }

}
