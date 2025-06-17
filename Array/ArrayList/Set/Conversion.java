package Array.ArrayList.Set;

import java.util.ArrayList;
import java.util.Collections;

public class Conversion {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(45);
        num.add(96);
        num.add(94);
        num.add(760);
        Integer[] nu = num.toArray(new Integer[0]);
        for(int i=0;i<nu.length;i++){
            System.out.println(nu[i]);
        }

    }
}
