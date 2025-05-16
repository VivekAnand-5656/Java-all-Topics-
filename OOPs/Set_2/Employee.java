package OOPs.Set_2;

public class Employee {
    public String name;
    public int id;
    public double salary;
    public void setEmployee(String name,int id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public double getSalary(){
        return salary;
    }
    public void displayInfo(){
        System.out.println("Name: "+getName());
        System.out.println("ID: "+getId());
        System.out.println("Salary: "+getSalary());
    }
    public boolean isAligbleForBonus(){
        if(salary<30000){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Employee det = new Employee();
        det.setEmployee("Vivek Anand",101,55000);
        det.displayInfo();
        System.out.println((det.isAligbleForBonus())?"Eligble for Bonus.":"Not Eligble for Bonus!");
    }
}
