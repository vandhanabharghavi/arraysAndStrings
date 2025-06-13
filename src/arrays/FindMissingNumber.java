package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindMissingNumber {
    public static void main(String[] args){
        int[] arr = {1,2,3,3,4,6};
        Set<Integer> expected = new HashSet<>();
        for(int num : arr){
            expected.add(num);
        }
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();

        for(int i = min ;i<=max;i++){
            expected.add(i);
        }
        for(int num:arr){
            expected.remove(num);
        }
        System.out.println(expected);
    }
}
