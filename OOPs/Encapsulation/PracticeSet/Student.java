package OOPs.Encapsulation.PracticeSet;

import java.util.Scanner;

public class Student {
    private String name;
    private int rollNo;
    private double marks;

    public void setName(String name,int rollNo,double marks){
        this.name = name;
        if(rollNo >0){
            this.rollNo = rollNo;
        } else {
            System.out.println("Wrong Roll No");
        }
        if(marks > 0){
            this.marks = marks;
        } else {
            System.out.println("Wrong Marks");
        }
    }
    public String getName(){
        return name;
    }
    public int getRollNo(){
        return rollNo;
    }
    public double getMarks(){
        return marks;
    }
    public void display(){
//        System.out.println("Name: "+name);
//        System.out.println("Roll Num: "+rollNo);
//        System.out.println("Marks: "+marks);
        System.out.println("Name: "+getName());
        System.out.println("Roll No: "+getRollNo());
        System.out.println("Marks: "+getMarks());
    }

    public static void main(String[] args) {
        Scanner inp  = new Scanner(System.in);
        Student obj = new Student();
        System.out.println("Enter name: ");
        String name = inp.nextLine();
        System.out.println("Enter Roll No: ");
        int age = inp.nextInt();
        System.out.println("Enter Marks: ");
        double marks = inp.nextDouble();
        obj.setName(name,age,marks);
        obj.display();
    }
}
