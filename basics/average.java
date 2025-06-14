package basics;

import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter 1st number: ");
            int a,b,c;
            double avg;
            a=s.nextInt();
            System.out.println("Enter 2nd number: ");
            b=s.nextInt();
            System.out.println("Enter 3rd number: ");
            c=s.nextInt();
            avg=(a+b+c)/3;
            System.out.println("the average of "+a+", "+b+", "+c+" is: "+avg);
        }
    }
}
