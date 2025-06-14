package bit_manipulation;

import java.util.Scanner;

public class bit4 {
    void decimalToBinary(int n){
        String binary=Integer.toBinaryString(n);
        System.out.println(n+" got converted to "+binary);
    }
    void binaryToDecimal(String b){
        int dec = Integer.parseInt(b,2);
        System.out.println(b+" got converted to "+ dec);
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("enter a binary number: ");
            String bin = s.nextLine();
            System.out.print("enter a decimal number: ");
            int n = s.nextInt();
            bit4 ob=new bit4();
            ob.decimalToBinary(n);
            ob.binaryToDecimal(bin);
        }
    }
}
