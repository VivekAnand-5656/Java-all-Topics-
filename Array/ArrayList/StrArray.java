package Array.ArrayList;

import java.util.ArrayList;

public class StrArray {
    ArrayList<String> arr = new ArrayList<>();

    public void adding(){
        arr.add("Vivek Anand");
        arr.add("Rajiv Kumar");
        arr.add("Satyam Kumar");
    }
    public void display(){
        System.out.println(arr);
    }

    public static void main(String[] args) {
        StrArray obj = new StrArray();
        obj.adding();
        obj.display();
    }
}
