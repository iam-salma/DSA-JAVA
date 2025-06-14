package recursion;
import java.util.Scanner;

public class occ {
    public static int first=-1;
    public static int last=-1;

    public static void first(int i,String str,char c){
        if(i == str.length()) return;
            if(i == str.indexOf(c))
                System.out.println("the first pos of char occured at "+(i+1)+" position");
            first(i+1, str, c);
    }

    public static void last(int i,String str,char c){
        if(i == -1) return;
            if(i == str.lastIndexOf(c))
                System.out.println("the last pos of char occured at "+(i+1)+" position");
            last(i-1, str, c);
    }

    public static void alt(int i,String str,char c){
        if(i == str.length()){
            System.out.println("the first pos of char occured at "+first+" position");
            System.out.println("the last pos of char occured at "+last+" position");
            return;
        }
        char curr = str.charAt(i);
            if(curr == c){
                if(first == -1) first = last = i;
                else last = i;
            }
        alt(i+1, str, c);
    }
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("enter a string: ");
            String str = s.nextLine();
            System.out.print("enter an element from the string: ");
            char c = s.next().charAt(0);
            // first(0, str, c);
            // last(str.length()-1, str, c);
            alt(0, str, c);
        }
    }
}
