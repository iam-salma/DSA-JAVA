package functions;

import java.util.Scanner;

public class greater {
    int great(int x,int y){
        if(x>y)
        return x;
        else
        return y;
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int a,b;
            System.out.println("Enter 1st number: ");
            a=s.nextInt();
            System.out.println("Enter 2nd number: ");
            b=s.nextInt();
            greater obj=new greater();
            System.out.println("the greater number is: " + obj.great(a,b));
        }
    }
}
