package arrays;

import java.util.Scanner;

public class search {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter array length: ");
            int n=s.nextInt();
            int arr[]=new int[n];
            System.out.println("enter the elements of the array: ");
            for(int i=0;i<n;i++){
                System.out.print("arr["+i+"] : ");
                arr[i]=s.nextInt();
                System.out.println();
            }
            System.out.print("Enter the number to be searched: ");
            int x=s.nextInt();
            for(int i=0;i<n;i++){
                if(arr[i] ==x){
                    System.out.println(x+" is found at position "+(i+1));
                    break;
                }if(i ==(n-1))
                    System.out.println("the number is not found");
            }
        }
    }
}