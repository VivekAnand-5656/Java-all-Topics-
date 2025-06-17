package Array.ArrayList.Set;

import java.util.ArrayList;

public class Numbers {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList();
        numbers.add(10);
        numbers.add(50);
        numbers.add(85);
        numbers.add(896);
        numbers.add(60);
        for(Integer num : numbers){
            System.out.println(num);
        }
    }
}
