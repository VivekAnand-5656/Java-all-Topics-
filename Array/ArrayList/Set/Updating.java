package Array.ArrayList.Set;

import java.util.ArrayList;
import java.util.Collections;

public class Updating {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(115);
        numbers.add(95);
        numbers.add(45);
        numbers.add(90);
        numbers.add(50);
        System.out.println(numbers);
        numbers.set(2,895);
        numbers.set(4,56);
        numbers.remove(3);
        Collections.sort(numbers,Collections.reverseOrder());
        System.out.println(numbers.contains(56));
        System.out.println(numbers);
    }
}
