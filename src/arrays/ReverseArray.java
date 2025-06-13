package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[arr.length - i - 1] = arr[i];
        }
        for(int i = 0; i < arr.length; i++)
            System.out.println(res[i]);

        //other better ways
        List<Integer> list = new LinkedList<>();
        for (int j : arr) list.add(j);
        Collections.reverse(list);
        System.out.println(list);

        //way 3
        int temp =0;
        for(int i =0;i<arr.length/2;i++){
            temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
        for (int j : arr) System.out.println(j);

    }
}
