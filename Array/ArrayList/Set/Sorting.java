package Array.ArrayList.Set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(45);
        numbers.add(65);
        numbers.add(89);
        numbers.add(456);
        numbers.add(96);
        numbers.add(49);
        numbers.add(33);
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println("Acending Order: "+numbers);
        Collections.sort(numbers,Collections.reverseOrder());
        System.out.println("Decending Order: "+numbers);
    }
}
