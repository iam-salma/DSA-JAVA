package strings;

import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("enter a string: ");
            String str=s.nextLine();
            String result="";
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)=='e')
                    result+='i';
                else result+=str.charAt(i);
            }
            System.out.println(result);
        }
    }
}
