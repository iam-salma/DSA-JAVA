package recursion;

import java.util.HashSet;
import java.util.Scanner;

public class subsequence {
    public static void sub(int i, String s, String newStr, HashSet<String> set){
        if(i == s.length()){
            if(set.contains(newStr))
                return;
            set.add(newStr);
            System.out.println(newStr);
            return;
        }
        //wants to be present
        sub(i+1, s, newStr + s.charAt(i), set);
        //not to be present
        sub(i+1, s, newStr, set);
    }
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("enter a string: ");
            String str = s.nextLine();
            HashSet<String> set = new HashSet<>();
            sub(0, str, "", set);
        }
    }
}
