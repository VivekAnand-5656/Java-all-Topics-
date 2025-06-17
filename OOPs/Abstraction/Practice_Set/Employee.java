package OOPs.Abstraction.Practice_Set;

abstract class Employee {

    abstract void setName(String name,int empID, int age, double salary);
    abstract void calculateSalary(double allowence);
}
class Developer extends Employee{
    String name;
    int age;
    int empId;
    double salary;

    public void setName(String name,int empId,int age,double salary){
        this.name = name;
        if(empId>0){
            this.empId = empId;
        } else {
            System.out.println("Wrong ID");
        }
        if(age>0){
            this.age = age;
        } else {
            System.out.println("Enter Correct Age");
        }
        if(salary > 0){
            this.salary = salary;
        } else {
            System.out.println("Invalid Ammount");
        }
    }
    public void calculateSalary(double allowence){
        double grossSalary;
        if(allowence>0){
            grossSalary = salary + allowence;
            System.out.println("Gross Salary: "+grossSalary);
        } else {
            System.out.println("Encorrect allowence amount");
        }

    }
    public void getDetails(){
        System.out.println("------- Employee Details --------");
        System.out.println("Name: "+name);
        System.out.println("ID: "+empId);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
    }

    public static void main(String[] args) {
        Developer dev = new Developer();
        dev.setName("Vivek Anand",102,21,50000);
        dev.getDetails();
        dev.calculateSalary(20000);
    }

}
