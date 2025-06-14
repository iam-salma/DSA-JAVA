package linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class userinp {
    
    public static void main(String[] args) {
        int n= 0;
        LinkedList<Integer> list = new LinkedList<>();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the elements to add (0 to exit): ");
            System.out.print("(the elements entered should be from 1 to 50): ");
            while(n >= 0 && n <= 50){
                n= sc.nextInt();
                if(n == 0) break;
                if(n <= 25)
                    list.add(n);
            }
        }
        System.out.println(list);
    }
}
