package recursion;

import java.util.Scanner;

public class subseq {
    public static void subs(int i, String s, String newStr){
        if(i == s.length()){
            System.out.println(newStr);
            return;
        }
        //wants to be present
        subs(i+1, s, newStr + s.charAt(i));
        //not to be present
        subs(i+1, s, newStr);
    }
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("enter a string: ");
            String str = s.nextLine();
            subs(0, str, "");
        }
    }
}

