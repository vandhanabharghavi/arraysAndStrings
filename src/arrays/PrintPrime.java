package arrays;

public class PrintPrime {
    public static void main(String[] args){
        for(int i = 0;i<=10;i++){
            for(int j = 2;j<=10;j++) {
                if (i == 0 || i == 1)
                { System.out.println(i + " prime");break;}
                if(i%j==0)
                { System.out.println(i+" not prime");break;}
                else
                { System.out.println(i+" prime");break;}

            }
        }
    }
}
