package OOPs.Overloading.Sets;

public class Employee {
    int getBonus(){
       return 1000;
    }
}
class Manager extends Employee{
    int getBonus(){
        return 3000;
    }
}
class Developer extends Employee{
    int getBonus(){
        return 2000;
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        Developer dv = new Developer();
        Manager mn = new Manager();
        System.out.println("Employee Bonus: "+emp.getBonus());
        System.out.println("Manager Bonus: "+mn.getBonus());
        System.out.println("Developer Bonus: "+dv.getBonus());

    }
}