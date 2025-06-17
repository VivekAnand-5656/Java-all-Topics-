package Array.ArrayList.NewSet;

import java.util.ArrayList;
import java.util.Scanner;

public class Fruits {
    Scanner inp = new Scanner(System.in);
    ArrayList<String> fruit = new ArrayList<>();
    public void fruits(){
        fruit.add("Aplle");
        fruit.add("Banand");
        fruit.add("Pineapple");
        fruit.add("Guava");
        System.out.println("----- Fruits ------");
        System.out.println(fruit);
    }
    public void addFruits(String addFruit){
         fruit.add(addFruit);
        System.out.println("----- Update Fruits -------");
        System.out.println(fruit);
    }
    public static void main(String[] args) {
        Fruits frt = new Fruits();
        frt.fruits();
        frt.addFruits("Date");
    }
}
