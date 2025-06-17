package OOPs.Encapsulation.Set_1;

public class NewStudentsData {
    private String name;
    private int age;
    private double marks;
    public void setName(String name, int age, double marks){
        this.name = name;
        if(age>0){
            this.age = age;
        }
        if(marks>0){
            this.marks = marks;
        }
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getMarks(){
        return marks;
    }
    public void studentData(){
        System.out.println("Name: "+getName());
        System.out.println("Age: "+getAge());
        System.out.println("MArks: "+getMarks());
    }

    public static void main(String[] args) {
        NewStudentsData data = new NewStudentsData();
        data.setName("Vivek Anand",21,450);
        data.studentData();
    }
}
