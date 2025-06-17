package Array.ArrayList.Set;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Scanner;

public class SortStudents {
    String name;
    int age;
    double marks;
    SortStudents (String name,int age,double marks){
        this.name = name;
        this.age = age;
        this.marks =marks;
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Marks: "+marks);
    }
    public static void main(String[] args) {
         Scanner inp = new Scanner(System.in);
         ArrayList<SortStudents> boys = new ArrayList<>();
        System.out.println("Enter num: ");
        int num = inp.nextInt();
        inp.nextLine();
        for(int i=0;i< num;i++){
            System.out.println("Enter name: ");
            String name = inp.nextLine();
            System.out.println("Enter age: ");
            int age = inp.nextInt();
            System.out.println("Enter marks: ");
            double marks = inp.nextDouble();
            inp.nextLine();
            boys.add(new SortStudents(name,age,marks));
        }
        for(int i=0;i<boys.size();i++){
            System.out.println(boys);
        }

    }
}
