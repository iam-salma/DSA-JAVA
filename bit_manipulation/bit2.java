package bit_manipulation;

import java.util.Scanner;

public class bit2 {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("enter a number: ");
            int n= s.nextInt();
            System.out.print("enter a postion to toggle: ");
            int pos= s.nextInt();
            int bitMask= 1<<pos;
            if((bitMask & n) ==0){  //set
                System.out.println("result: "+(bitMask | n));
            }else{                  //clear
                System.out.println("result: "+((~bitMask) & n));
            }
        }
    }
}

