package OOPs.Inheritance.Set_1;

public class Course {
    String courseName = "Java Programming";
    void showCourse(){
        System.out.println("Course: "+courseName);
    }
}
class EnrolledStudent extends Course{
    String studentName = "Vivek Anand";
    int rollNum = 101;
    void showCourse(){
        super.showCourse();
        System.out.println("Student Name: "+studentName);
        System.out.println("Roll no: "+rollNum);
    }

    public static void main(String[] args) {
        EnrolledStudent obj = new EnrolledStudent();
        obj.showCourse();
    }
}
