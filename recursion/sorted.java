package recursion;

import java.util.Scanner;

public class sorted {
    public static void check(int i,int n,int arr[]){
        if(i == n) {
            System.out.println("array is sorted in asc order!");
            return;
        }
        if(arr[i] > arr[i+1]){
            System.out.println("array is not sorted in asc order!");
            return;
        }
        check(i+1, n, arr);
    }
    
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter the size of array to be checked: ");
            int n = s.nextInt();
            int arr[] = new int[n];
            System.out.println("enter the elements of array one by one: ");
            for(int i= 0; i< n; i++){
                System.out.print("arr["+ i +"]= ");
                arr[i] = s.nextInt();
            }
            check(0, n, arr);
        }
    }
}
