package arrays;

public class SumOfDigits {
    public static void main(String[] args){
        int digit = 123;
        int temp = 0;
        int sum = 0;
        while(digit>0){
            temp=digit%10;//123
            sum+=temp;//3 + 2
            digit/=10;//1
        }
        System.out.println(sum);
    }
}
