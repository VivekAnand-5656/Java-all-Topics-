package OOPs.PersonalPractice;

public class Person {
    private String name;
    private int age;
    private double salary;
    public void setName(String name,int age,double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getSalary(){
        return salary;
    }
    public void display(){
        System.out.println("Name: "+getName());
        System.out.println("Age: "+getAge());
        System.out.println("Salary: "+getSalary());
    }

    public static void main(String[] args) {

    }
}
