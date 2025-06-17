package OOPs.Constructor;

// this() to Call Another Constructor (Constructor Chaining)
public class Student {
    String name;
    int age;
    Student(){
        this("Vivek Anand",21);
    }
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println("Name: "+name+" Age: "+age);
    }
    public static void main(String[] args) {
        Student obj = new Student();
        obj.display();
    }
}
