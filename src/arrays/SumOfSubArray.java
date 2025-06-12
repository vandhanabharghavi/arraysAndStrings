package arrays;

import java.util.HashMap;
import java.util.Map;

public class SumOfSubArray {
    public static void main(String[] args){
        int[] arr= {1,2,3};
        int sum =0,count=0,k=3;

        //one for sum and one for count
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        for (int j : arr) {
            sum += j;

            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        System.out.println(count);
    }
}
