package Array.ArraySet;

import java.util.Scanner;

public class StudentSearch {
    private String name;
    private int age;
    private double marks;
    StudentSearch(String name,int age,double marks){
        this.name = name;
        if(age>0){
            this.age = age;
        }
        if(marks>0){
            this.marks = marks;
        }
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Marks: "+marks);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter Number of Student: ");
        int size = inp.nextInt();
        inp.nextLine();
        StudentSearch[] student = new StudentSearch[size];

        double marks;
        for(int i=0;i<size;i++){

            System.out.println("Enter name: ");
            String name = inp.nextLine();

            System.out.println("Enter age: ");
            int age = inp.nextInt();

            System.out.println("Enter marks: ");
            marks = inp.nextDouble();
            inp.nextLine();
            student[i] = new StudentSearch(name,age,marks);
        }
        double max = student[1].marks;
        for(int i=0;i<size;i++){
                if(student[i].marks > max) {
                    max = student[i].marks;
                }
        }
        for(int i=0;i<size;i++){
            if(max==student[i].marks){
                System.out.println("-----Highest Rank---");
                student[i].display();
                
            }
        }
    }
}
