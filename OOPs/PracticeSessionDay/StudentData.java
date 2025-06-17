package OOPs.PracticeSessionDay;

import java.util.*;

public class StudentData {
    protected String name;
    protected int age;
    protected double marks;
    protected String course;
    public void input(int size){
        Scanner inp = new Scanner(System.in);
        for(int i=1;i<=size;i++){
            System.out.println("Enter name: ");
            name = inp.nextLine();
            System.out.println("Enter Age: ");
            age = inp.nextInt();
            System.out.println("Enter Marks: ");
            marks = inp.nextDouble();
            inp.nextLine();
            System.out.println("Enter Course: ");
            course = inp.nextLine();
            inp.nextLine();
        }
    }
    public void output(int size){
        for(int i=1;i<=size;i++){
            System.out.println("Student "+i+": Name: "+name+", Age: "+age+", Marks: "+marks+", Course: "+course);
        }
    }

    public static void main(String[] args) {
        StudentData obj = new StudentData();
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = inp.nextInt();
        obj.input(size);
        obj.output(size);
    }
}
