package arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSumHashMap {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6};
        int target = 6;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<arr.length;i++){
            int sum = target - arr[i];
            if(map.containsKey(sum)){
                System.out.println(map.get(sum)+" "+i);
                System.out.println(arr[map.get(sum)]+" "+arr[i]);
                break;
            }
            map.put(arr[i],i);
        }
    }
    }
