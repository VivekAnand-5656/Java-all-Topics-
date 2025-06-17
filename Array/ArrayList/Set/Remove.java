package Array.ArrayList.Set;

import java.util.ArrayList;

public class Remove {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Vivek Anand");
        names.add("Rajiv Kumar");
        names.add("Satyam Kumar");
        names.add("Ritik Kumar");
        names.add("Amar Kumar");
        System.out.println(names);
        names.remove(3);
        System.out.println(names);

    }
}
