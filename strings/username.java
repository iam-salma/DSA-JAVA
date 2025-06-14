package strings;
import java.util.Scanner;

public class username {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("enter your email: ");
            String e=s.nextLine();
            System.out.println("username: "+e.substring(0,e.indexOf('@')));
        }
    }
}
