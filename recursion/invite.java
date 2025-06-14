package recursion;

import java.util.Scanner;

public class invite {

    public static int nofways(int n){
        if(n <= 1){
            return 1;
        }
        return nofways(n-1) + ((n-1) * nofways(n-2));
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter number of people to invite: ");
            int n = s.nextInt();
            System.out.println("the total number of ways to invite guests are: " + nofways(n));
        }
    }
}
