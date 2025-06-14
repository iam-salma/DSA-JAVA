package strings;

import java.util.Scanner;

public class revstring {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("enter a string: ");
            String str=s.nextLine();
            StringBuilder sb =new StringBuilder(str);
            for(int i=0;i<sb.length();i++){
                int front=i;
                int back=sb.length()-1-i;
                char front_char=str.charAt(front);
                char back_char=str.charAt(back);
                sb.setCharAt(front,back_char);
                sb.setCharAt(back,front_char);
            }
            System.out.println(sb);
            // or System.out.println(sb.reverse());
        }
    }
}
