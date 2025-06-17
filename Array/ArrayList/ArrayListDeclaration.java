package Array.ArrayList;

import java.util.*;

public class ArrayListDeclaration {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25);
        arr.add(27);
        arr.add(29);
        arr.add(30);
        arr.add(35);
        System.out.println("Array list: "+arr);
        arr.remove(3);
        System.out.println("Update: "+arr);
        arr.contains(27);
        System.out.println(arr.contains(20));
        

    }
}
