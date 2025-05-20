package OOPs.Inheritance.Set_1;

public class Person {
    void showDetails(){
        System.out.println("Person Details.");
    }
}
class Student extends Person{
    void showDetails(){
        System.out.println("Student Details.");
    }

    public static void main(String[] args) {
        Student detail = new Student();
        detail.showDetails();
    }
}
