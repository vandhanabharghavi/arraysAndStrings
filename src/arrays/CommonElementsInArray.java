package arrays;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CommonElementsInArray {
    public static void main(String[] args){
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new LinkedList<>();
        for(int n : array1)
            set.add(n);
        for(int n:array2)
        {
            if(set.contains(n))
                list.add(n);
        }
        System.out.println(list);
    }
}
