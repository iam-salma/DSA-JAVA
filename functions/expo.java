package functions;

import java.util.Scanner;

public class expo {
    double calc(int x,int n){
        double pow=Math.pow(x,n);
        return pow;
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            int n=s.nextInt();
            System.out.print("Enter the power: ");
            int e=s.nextInt();
            expo obj=new expo();
            System.out.println("the value of "+n+" raised to the power of "+e+" is: "+obj.calc(n,e));
        }
    }
}
