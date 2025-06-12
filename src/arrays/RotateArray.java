package arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6};
        int k =3;
        int n = arr.length;
        k = k % n;
        int[] temp = new int[n];
        for(int i =0;i<n;i++){
            temp[(i+k)%n]=arr[i];
        }
        for(int i =0;i<n;i++)
            System.out.println(temp[i]);
    }
}