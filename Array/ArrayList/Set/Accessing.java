package Array.ArrayList.Set;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Accessing {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(45);
        numbers.add(96);
        numbers.add(96);
        numbers.add(456);
        numbers.add(85);
        System.out.println(numbers);
        System.out.println(numbers.get(2));
    }
}
