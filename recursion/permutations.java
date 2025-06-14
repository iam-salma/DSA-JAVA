package recursion;

import java.util.Scanner;

public class permutations {
    public static void permutation(String s, String res){
        if(s.length() == 0){
            System.out.println(res);
            return;
        }
        for(int i= 0; i< s.length(); i++){
            String newStr = s.substring(0, i) + s.substring(i+1);
            permutation(newStr, res+s.charAt(i));
        }
    }
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("enter a string: ");
            String str = s.nextLine();
            permutation(str, "");
        }
    }
}
