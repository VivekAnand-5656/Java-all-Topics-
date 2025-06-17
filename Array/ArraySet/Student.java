package Array.ArraySet;

import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private double marks;
    Student(String name,int age,double marks){
        this.name = name;
        if(age>0){
            this.age =age;
        }
        if(marks>0){
            this.marks = marks;
        }
    }
    public void display(){
        System.out.println("------ Students Details -----");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Marks: "+marks);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size=3;
        Student[] students = new Student[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter Name: ");
            String name = inp.nextLine();

            System.out.println("Enter age: ");
            int age = inp.nextInt();

            System.out.println("Enter marks: ");
            double marks = inp.nextDouble();
            inp.nextLine();
            students[i] = new Student(name,age,marks);
        }
        for(int i=0;i<size;i++){
            students[i].display();
        }

    }
}
