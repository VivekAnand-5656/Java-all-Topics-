package Array.ArrayList.NewSet;

import Array.ArrayList.StrArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StrArry {
    Scanner inp = new Scanner(System.in);
    ArrayList<String> names = new ArrayList<>();
    ArrayList<String> secon = new ArrayList<>();
    public void second(){
        System.out.println("Enter number of Names: ");
        int siz = inp.nextInt();
        inp.nextLine();
        for(int i=0;i<siz;i++){
            System.out.println("Enter name: ");
            String name = inp.nextLine();
            secon.add(name);
        }
    }
    public void addNames(){
        System.out.println("Enter number of Names: ");
        int size = inp.nextInt();
        inp.nextLine();
        for(int i=0;i<size;i++){
            System.out.println("Enter name: ");
            String name = inp.nextLine();
            names.add(name);
        }
    }
    public void display(){
        System.out.println(names);
    }
    public void update(){
        System.out.println("Enter which elment update: ");
        int element = inp.nextInt();
        for(int i=0;i< names.size();i++){
            if(i==element){
                names.set(i,"Karan Aarya");
            }
        }
    }
    public void search(){
        System.out.println("Enter search element: ");
        String sear = inp.nextLine();
        if(names.contains(sear)){
            System.out.println("Person Found");
        } else {
            System.out.println("Person Not Found");
        }
    }
    public void reverseing(){
        Collections.reverse(names);
        System.out.println(names);
    }
    public void sorting(){
        Collections.sort(names);
        System.out.println("Acending: "+names);
        Collections.sort(names,Collections.reverseOrder());
        System.out.println("Decending order: "+names);
    }
    public void merge(){
        ArrayList<String> newArr = new ArrayList<>();
        for(int i=0;i< names.size();i++){
            newArr.add(names.get(i));
        }
        for(int i=0;i< secon.size();i++){
            newArr.add(secon.get(i));
        }
        System.out.println(newArr);
    }
    public static void main(String[] args) {
        StrArry obj = new StrArry();
        obj.addNames();
        obj.display();
        obj.second();
        obj.merge();
    }
}
