package recursion;
import java.util.Scanner;

public class remduplicate {
    public static boolean[] map = new boolean[26];
    public static void remove(int i, String s, String newStr){
        if(i == s.length()){
            System.out.println("result: "+ newStr);
            return;
        }
        char curr = s.charAt(i);
        if(map[curr -'a'] != true){
            newStr += curr;
            map[curr -'a'] = true;
        }
        remove(i+1, s, newStr);
    }
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("enter a string: ");
            String str = s.nextLine();
            remove(0, str ,"");
        }
    }
}
