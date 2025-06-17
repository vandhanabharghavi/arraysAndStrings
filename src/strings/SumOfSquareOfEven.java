package strings;

import java.util.Arrays;

public class SumOfSquareOfEven {
    public static void main(String[] args) {
        String[] arr = {"12", "13", "15","van", "16", "17", "18", "19", "20", "21", "22", "23"};
        int sumOfSqOfEven = Arrays.stream(arr).map(x->{
            try{
                return Integer.parseInt(x);
            }catch (NumberFormatException e){
                return null;
            }
        }).filter(x->x!=null && x%2==0)
                .mapToInt(x->x*x)
                .sum();
        System.out.println(sumOfSqOfEven);

    }
}
