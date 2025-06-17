package OOPs.Inheritance.Set_1;

public class College {
    String collegeName = "Techno Institute";
}
class Admission extends College{
    String studentName = "Vivke Anand";
    String course = "B.Tech";
    void display(){
        System.out.println("College: "+super.collegeName);
        System.out.println("Student: "+studentName);
        System.out.println("Course: "+course);
    }

    public static void main(String[] args) {
        Admission obj = new Admission();
        obj.display();

    }
}
