package recursion;

import java.util.Scanner;

public class revstringrec {
    public static void rev(int i,String s){
        if(i == -1) return;
        System.out.print(s.charAt(i));
        rev(i-1, s);
    }
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("enter a string: ");
            String str = s.nextLine();
            rev(str.length()-1, str);
        }
    }
}
