package OOPs.Inheritance.Set_1;

public class School {
    String schoolName = "Green Valley";
    void showSchool(){
        System.out.println("School: "+schoolName);
    }
}
class Teacher extends School{
    String teacherName = "Mr. Sharma";
    void showTeacherDetail(){
        System.out.println("Teacher: "+teacherName);
    }

    public static void main(String[] args) {
        Teacher obj = new Teacher();
        obj.showSchool();
        obj.showTeacherDetail();
    }
}
