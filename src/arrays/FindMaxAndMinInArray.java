package arrays;

import java.util.*;

public class FindMaxAndMinInArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 2, 2, 4, 4};
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : arr)
            map.put(i,map.getOrDefault(i,0)+1);
        int max = Collections.max(map.values());
        int min = Collections.min(map.values());
        List<Integer> maxList = new ArrayList<>();
        List<Integer> minList = new ArrayList<>();
        for(int i :map.values())
            max = Math.max(i,max);
        for(Map.Entry<Integer,Integer> e : map.entrySet())
        {
            if(e.getValue()==max)
                maxList.add(e.getKey());
            if(e.getValue()==min)
                minList.add(e.getKey());
        }
        System.out.println(minList+" "+maxList);
    }
}
