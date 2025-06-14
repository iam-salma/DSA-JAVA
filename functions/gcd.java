package functions;

import java.util.Scanner;

public class gcd {
    public static int div(int x,int y){
        
        if(x>=y){
            for(int i=x;i>1;i--){
                if(x%i==0 && y%i==0)
                return i;
            }
        }else{
            for(int i=y;i>1;i--){
                if(x%i==0 && y%i==0)
                return i;
            }
        }
        return 1;
    }
    public static int recursive(int a,int b){
        if(b==0)return a;
        else return recursive(b,a % b);
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter 1st number: ");
            int n=s.nextInt();
            System.out.print("Enter 2nd number: ");
            int m=s.nextInt();
            System.out.println("the gcd of "+n+" and "+m+" is: "+div(n,m));
            System.out.println("the gcd of "+n+" and "+m+" recursively is: "+recursive(n,m));
        }
    }
}
