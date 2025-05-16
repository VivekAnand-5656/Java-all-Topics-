package OOPs;

public class Student {
    String name;
    int age;
    void display(){
        System.out.println("Name : " + name + " , Age : "+age);
    }
    public static void main(String[]args){
        Student detail = new Student();
        detail.name = "Vivek Anand";
        detail.age = 20;
        detail.display();
    }
}
