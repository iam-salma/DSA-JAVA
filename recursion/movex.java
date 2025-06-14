package recursion;

import java.util.Scanner;

public class movex {
    public static void move(int idx, int count, String s, char c, String newString){
        if(idx == s.length()){
            System.out.print(newString);
            for(int i = 0; i< count; i++)
                System.out.print(c);
            return;
        }
        if(s.charAt(idx) == c)
            count++;
        else
            newString += s.charAt(idx);

        move(idx+1, count, s, c, newString);
    }
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("enter a string: ");
            String str = s.nextLine();
            System.out.print("enter the character to move: ");
            char c = s.next().charAt(0);
            move(0, 0, str, c, "");
        }
    }
}
//time comp: O(n+count) = O(n+n) = O(2n) ~~ O(n)
