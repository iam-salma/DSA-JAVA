package recursion;

import java.util.Scanner;

public class keypad {
    public static String keypad[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs","tu", "vwx", "yz"};

    public static void keypadcomb(int idx, String n, String comb){
        if(idx == n.length()){
            System.out.println(comb);
            return;
        }
        char curr = n.charAt(idx);
        String mapping = keypad[curr-'0'];
        for(int i= 0; i< mapping.length(); i++){
            keypadcomb(idx+1,n,comb+mapping.charAt(i));
        }
    }
    public static void main(String args[])  {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            String n = s.nextLine();
            keypadcomb(0, n, "");
        }
    }
}
