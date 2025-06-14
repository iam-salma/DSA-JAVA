package recursion;

import java.util.Scanner;

public class placetiles {
    public static int adjust(int n, int m){
        if(n == m) return 2;
        if(n < m) return 1;
        int ver = adjust(n-m, m);
        int hor = adjust(n-1, m);
        return ver + hor;
    }
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter number of rows: ");
            int n = s.nextInt();
            System.out.print("Enter number of columns: ");
            int m = s.nextInt();
            System.out.println("the number of ways to fit ("+ 1 +","+ m +") tiles is: "+ adjust(n, m));
        }
    }
}
