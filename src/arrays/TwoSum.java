package arrays;

import java.util.LinkedList;
import java.util.List;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        int target = 6;
        List<Integer> list = new LinkedList<>();
        for(int row =0;row<arr.length;row++){
            for(int col=row+1;col<arr.length;col++){
                if(arr[row]+arr[col]==target){
                    list.add(arr[row]);
                    list.add(arr[col]);
                }
            }
        }
        for(int i =0;i<list.size();i++)
            arr[i]=list.get(i);
        for(int i =0;i<list.size();i++)
            System.out.println(arr[i]);
    }
    }
