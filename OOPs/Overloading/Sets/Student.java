package OOPs.Overloading.Sets;

public class Student {
    void detail(String name,int age){
        System.out.println("Name: "+name+" Age: "+age);
    }
    void detail(String name,int age,String course){
        System.out.println("Name: "+name+" Age: "+age+" Course: "+course);
    }

    public static void main(String[] args) {
        Student det = new Student();
        det.detail("Vivek Anand",20);
        det.detail("Khushi Rani",19,"B.Tech");
    }
}
