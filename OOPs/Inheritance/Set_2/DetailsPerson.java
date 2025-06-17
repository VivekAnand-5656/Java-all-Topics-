package OOPs.Inheritance.Set_2;

import OOPs.PersonalPractice.Person;

public class DetailsPerson {
    private String name = "Vivek Anand";
    private int age = 21;
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void detail(){
        System.out.println("Person Name: "+name);
        System.out.println("Age: "+age);
    }
}
class Employee extends DetailsPerson{
    private int employeeId = 101;
    private double salary = 55000;
    public int getEmployeeId(){
        return employeeId;
    }
    public double getSalary(){
        return salary;
    }
    public void empDetail(){
        System.out.println("Employee ID: "+employeeId);
        System.out.println("Salary: "+salary);
    }
}
class Manager extends Employee{
    private String department = "HR";
    private int teamSize = 5;
    public String getDepartment(){
        return department;
    }
    public int getTeamSize(){
        return teamSize;
    }
    public void managerDetial(){
        System.out.println("Department: "+department);
        System.out.println("Team Size: "+teamSize);
    }
    public static void main(String[] args) {
        Manager obj = new Manager();
        obj.detail();
        obj.empDetail();
        obj.managerDetial();
    }
}
