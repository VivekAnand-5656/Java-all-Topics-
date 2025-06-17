package Array.ArrayList.NewSet;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Elements {
    Scanner inp = new Scanner(System.in);
    ArrayList<Integer> elem = new ArrayList<>();
    public void addElement(){
        System.out.println("Enter size of elements: ");
        int size = inp.nextInt();
        for(int i=0;i<size;i++){
            System.out.println("Enter Element: ");
            int elm = inp.nextInt();
            elem.add(elm);
        }
    }
    public void display(){
        System.out.println("---- Elements -----");
        System.out.println(elem);
    }
    public void delete(){
        System.out.println("Enter ELment to Delete: ");
        int delElement = inp.nextInt();
        elem.remove(delElement);
    }
    public void maxMin(){
        System.out.println("Max: "+Collections.max(elem));
        System.out.println("Min: "+Collections.min(elem));
    }
    public static void main(String[] args) {
        Elements obj = new Elements();
        obj.addElement();
        obj.display();
        obj.delete();
        obj.display();
        obj.maxMin();
    }
}
