package recursion;

import java.util.Scanner;

public class countpath {

    public static int countpathmaze(int i, int j, int n, int m){
        if(i == n-1 || j == m-1){
            return 1;
        }
        return countpathmaze(i, j+1, n, m) + countpathmaze(i+1, j, n, m);
    }
    
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter number of rows: ");
            int n = s.nextInt();
            System.out.print("Enter number of columns: ");
            int m = s.nextInt();
            System.out.println("the number of paths to reach (" + n +","+ m + ") recursively is: " + countpathmaze(0, 0, n, m));
        }
    }
}
