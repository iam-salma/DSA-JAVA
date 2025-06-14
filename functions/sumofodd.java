package functions;

import java.util.Scanner;

public class sumofodd {
    public static void Add(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0)
            sum=sum+i;
        }
        System.out.println("the sum of all odd numbers is: "+sum);
    }

        public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter limit: ");
            int n=s.nextInt();
            Add(n);
        }
    }
}
