package Array;

import java.util.Scanner;

public class for_each {
    int size;
    public String[] students = new String[size];
    public void setSize(String[] students,int size){
        this.students = students;
        this.size = size;
    }
    public void iput(){
        Scanner inp = new Scanner(System.in);
        for(int i =0;i<size;i++){
            System.out.println("Enter Name: "+i+": ");
            students[i] = inp.nextLine();
        }
    }
    public void output(){
        System.out.println("Details: ");
        for(int i=0;i<size;i++){
            System.out.println(students[i]);
        }

    }
    public static void main(String[]args){
//        String names[] = {"Vivek", "Satyam", "Ritik", "Karan", "Rajiv"};
//        for(String name : names){
//            System.out.println("For each: " + name);
//        }
        for_each bo = new for_each();
        int size = 5;
        String[] students = new String[size];
        bo.setSize(students,size);
        bo.iput();
        bo.output();

    }
}
