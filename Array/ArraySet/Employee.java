package Array.ArraySet;

import java.lang.reflect.Array;
import java.util.*;

public class Employee {
    String name;
    int id;
    double salary;
    Employee(String name,int id,double salary){
        this.name = name;
        if(id>0){
            this.id = id;
        }
        if(salary > 0){
            this.salary = salary;
        }
    }
    public void displayDetail(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Salary: "+salary);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter number if employee:");
        int size = inp.nextInt();
        inp.nextLine();
        Employee[] employee = new Employee[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter Name: ");
            String name = inp.nextLine();
            System.out.println("Enter ID: ");
            int id = inp.nextInt();
            System.out.println("Enter Salary: ");
            double salary = inp.nextDouble();
            inp.nextLine();

            employee[i] = new Employee(name,id ,salary);
        }
        Arrays.sort(employee,new Comparator<Employee>() {
            public int compare(Employee o1, Employee o2) {
                return Double.compare(o1.salary,o2.salary);
            }
        });
        for(Employee emp : employee){
            emp.displayDetail();
        }


    }

}
