package arrays;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args){
        int[] arr = {1,1,2,2,3,3,4,5};
        List<Integer> list = new ArrayList<>();
        for (int j : arr) {
            list.add(j);
        }
        System.out.println(list);

        Set<Integer> set = new HashSet<>(list);
        System.out.println(set);

    }
}
