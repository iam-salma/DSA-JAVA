package bit_manipulation;

import java.util.Scanner;

public class bit3 {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("enter a number: ");
            int n= s.nextInt();
            String binN=Integer.toBinaryString(n);
            int count=0;
            for(int i=0;i<binN.length();i++){
                int bitMask= 1<<i;
                if((bitMask & n) !=0)
                    count++;
            }
            System.out.println("number of 1s in "+n+" when converted into "+binN+" is: "+count);
        }
    }
}
