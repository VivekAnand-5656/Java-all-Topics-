package Array.ArrayList.NewSet;

import OOPs.Encapsulation.PracticeSet.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDatas {
    Scanner inp = new Scanner(System.in);
     String name;
     int age;
     double marks;
     boolean isPass;
    StudentDatas(String name,int age,double marks)
    {
        this.name =name;
        if(age>0){
            this.age = age;
        }
        if(marks>0){
            this.marks = marks;
        }
        if(marks>250){
            isPass = true;
        } else {
            isPass=false;
        }
    }
    public void check(){

    }
    public void displayDetail(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Marks: "+marks);
        if(isPass){
            System.out.println("Pass");
        } else {
            System.out.println("Failed !");
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
         ArrayList<StudentDatas> student = new ArrayList<>();
        System.out.println("Enter num of Student: ");
        int num = inp.nextInt();
        for(int i=0;i<num;i++){
            System.out.println("Enter name: ");
            String name = inp.nextLine();
            System.out.println("Enter age: ");
            int age = inp.nextInt();
            System.out.println("Enter marks: ");
            double marks = inp.nextDouble();
            inp.nextLine();
            student.add(new StudentDatas(name,age,marks));
        }

    }

}
