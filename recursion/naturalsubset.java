package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class naturalsubset {
    public static void subsets(int n, ArrayList<Integer> subset){
        if(n == 0){
            //print
            for(int i=0; i< subset.size(); i++)
                System.out.print(subset.get(i)+" ");
            System.out.println();
            return;
        }
        //includes
        subset.add(n);
        subsets(n-1, subset);
        
        //does'nt include
        subset.remove(subset.size() - 1);
        subsets(n-1, subset);
    }
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter limit: ");
            int n = s.nextInt();
            ArrayList<Integer> subset = new ArrayList<> ();
            subsets(n, subset);
        }
    }
}
