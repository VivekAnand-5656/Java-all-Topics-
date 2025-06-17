package OOPs.PracticeSessionDay;

import java.util.Scanner;

public class Student {
    String name;
    int age;
    String mob;
    void input(Student studenA,Student studentB,Student studentC){
        Scanner inp = new Scanner(System.in);

            System.out.println("Name: ");
            studenA.name = inp.nextLine();
            System.out.println("Age: ");
            studenA.age = inp.nextInt();
            inp.nextLine();
            System.out.println("Mobile Num: ");
            studenA.mob = inp.nextLine();
            inp.nextLine();
            System.out.println("Second Student Name: ");
            studentB.name = inp.nextLine();
            System.out.println("Second Student Age: ");
            studentB.age = inp.nextInt();
            inp.nextLine();
            System.out.println("Second Student Mobile Num: ");
            studentB.mob = inp.nextLine();
            inp.nextLine();
            System.out.println("Third Student Name: ");
            studentC.name = inp.nextLine();
            System.out.println("Third Student Age: ");
            studentC.age = inp.nextInt();
            inp.nextLine();
            System.out.println("Third Student Mobile Num: ");
            studentC.mob = inp.nextLine();

    }
    void output(Student studentA,Student studentB,Student studentC){
            System.out.println("Student: "+studentA.name+" "+studentA.age+" "+studentA.mob);
            System.out.println("Student: "+studentB.name+" "+studentB.age+" "+studentB.mob);
            System.out.println("Student: "+studentC.name+" "+studentC.age+" "+studentC.mob);
    }

    public static void main(String[] args) {
        Student obj = new Student();
        Student obj2 = new Student();
        Student obj3 = new Student();
        obj.input(obj,obj2,obj3);
        obj.output(obj,obj2,obj3);
    }
}
