package arrays;

public class Fibbonacci {
    public static void main(String[] args)
    {
        int a =0, b =1;
        System.out.println(a);
        System.out.println(b);
        for(int i =2;i<=10;i++){
            int next = a + b;
            System.out.println(next);
            a = b;
            b = next;

        }

    }
}
