package bit_manipulation;

import java.util.Scanner;

public class bit1 {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("enter a number: ");
            int n= s.nextInt();
            if((1 & n) ==0)
            System.out.println(" number is power of 2");
            else
            System.out.println(" number is not power of 2");
        }
    }
}
