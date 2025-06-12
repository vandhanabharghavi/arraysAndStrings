package arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSumHM {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        int target = 6;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<arr.length;i++){
            int comp = target - arr[i];
            if(map.containsKey(comp)){
                System.out.println(comp+" "+arr[i]);
            }
            map.put(arr[i],i);
        }
    }
}
