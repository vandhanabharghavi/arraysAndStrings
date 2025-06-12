package arrays;

public class MaximumSubArraySum {
    public static void main(String[] args) {
        int[] arr = {2,3,-8,7,-1,2,3};
        int max =0;
        int sum =0;
        for(int i =0;i<arr.length;i++){
            sum =0;
            for(int j =i;j<arr.length;j++){
                sum+=arr[j];
                max = Math.max(sum,max);
            }
        }
        System.out.println(max);
    }
    }
