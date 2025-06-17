package OOPs.Constructor;

public class CopyCinstructor {
    String name;
    int age;
    CopyCinstructor(String newName,int newAge){
        this.name=newName;
        this.age=newAge;
    }
    CopyCinstructor(CopyCinstructor s){
        this.name=s.name;
        this.age=s.age;
    }
    void display(){
        System.out.println("Student: "+name+" Age: "+age);
    }
    public static void main(String[] args) {
        CopyCinstructor obj = new CopyCinstructor("Vivek Anand",21);
        CopyCinstructor obj2 = new CopyCinstructor(obj);
        obj.display();
        obj2.display();
    }
}
