package basics;

import java.util.Scanner;

public class fib {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter limit: ");
            int n=s.nextInt();
            int val1=0,val2=1,val3;
            if(n>=1)
                System.out.print("\t0\t");
            if(n>=2)
                System.out.print("1\t");
            for(int i=3;i<=n;i++){
                val3=val1+val2;
                System.out.print(val3+"\t");
                val1=val2;
                val2=val3;
            }
        }
        
    }
}
