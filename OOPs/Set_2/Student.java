package OOPs.Set_2;

import java.util.Scanner;

public class Student {
    private String name;
    private int rollNum;
    private double marks;
    public void setName(String name,int rollNum, double marks){
        this.name=name;
        this.rollNum=rollNum;
        this.marks=marks;
    }
    public String getName(){
        return name;
    }
    public int getRollNum(){
        return rollNum;
    }
    public double getMarks(){
        return marks;
    }
    public void displayInfo(){
        System.out.println("Name: "+getName());
        System.out.println("Roll Num: "+getRollNum());
        System.out.println("Marks: "+getMarks());
    }
    public boolean hasPassed(){
        return marks>=40;
    }
    public static void main(String[] args) {
        Student obj = new Student();
        Scanner inp = new Scanner(System.in);
        System.out.printf("Enter Name: ");
        obj.name = inp.nextLine();
        System.out.printf("Enter roll num: ");
        obj.rollNum = inp.nextInt();
        System.out.printf("Enter Marks: ");
        obj.marks = inp.nextDouble();
        obj.setName(obj.name,obj.rollNum,obj.marks);
        obj.displayInfo();
        if(obj.hasPassed()){
            System.out.println("Passed");
        } else {
            System.out.println("Failed!");
        }
    }
}
