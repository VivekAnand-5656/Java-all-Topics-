package Array.ArrayList.Set;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterate {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(45);
        arr.add(96);
        arr.add(55);
        arr.add(32);
        arr.add(12);
//        for(int i=0;i<arr.size();i++){
//            System.out.println(arr.get(i));
//        }
//        Iterator<Integer> it = arr.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
        Integer[] nums = arr.toArray(new Integer[0]);
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }

    }
}
