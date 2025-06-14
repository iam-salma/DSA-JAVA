package recursion;

import java.util.Scanner;

public class power {
    public static int calc(int x, int n){
        if(n == 0) return 1;
        if(n == 1) return x;
        else return x * calc(x, n-1);
    }
    public static void main(String args[]){
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("enter base and exponent: ");
            int x = s.nextInt();
            int n = s.nextInt();
            System.out.println("result: "+ calc(x, n));
        }
    }
}
