package arrays;

public class SortArray {
    public static void main(String[] args){
        int[] arr = {4,2,3,6,7,1,2};
        int temp =0;
        for(int i =0;i<arr.length-1;i++){
            for(int j =0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for (int j : arr) System.out.println(j);

        System.out.println();

        //for desc order
        int[] array = {4,2,3,6,7,1,2};
        for(int i =0;i<array.length-1;i++){
            for(int j =0;j<array.length-i-1;j++){
                if(array[j]<array[j+1]){
                    temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        for(int j :array)System.out.println(j);
    }
}
