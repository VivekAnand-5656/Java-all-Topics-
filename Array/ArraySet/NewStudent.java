package Array.ArraySet;

import OOPs.WrapperClasses.CompareTo;

import java.util.Scanner;

public class NewStudent {
    String name;
    int id;
    double marks;
    NewStudent(String name,int id,double marks){
        this.name = name;
        this.id = id;
        this.marks = marks;
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
        System.out.println("Marks: "+marks);
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter number of student: ");
        int size = inp.nextInt();
        inp.nextLine();
        NewStudent[] stdnt = new NewStudent[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter name: ");
            String name = inp.nextLine();
            System.out.println("Enter ID: ");
            int id = inp.nextInt();
            System.out.println("Enter marks: ");
            double marks = inp.nextDouble();
            inp.nextLine();

            stdnt[i] = new NewStudent(name,id,marks);
        }

        int k=0;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(stdnt[i].name.equals(stdnt[j].name)){
                    k = 1;
                    stdnt[i].display();
                }
            }

        }
        if(k==0){
            System.out.println("Data not match");
        }
    }
}
