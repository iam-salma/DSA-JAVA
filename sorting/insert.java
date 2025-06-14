package sorting;

import java.util.Scanner;

public class insert {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of array to be sorted: ");
            int n=sc.nextInt();
            int arr[]=new int[n];
            System.out.println("enter the elements of array one by one: ");
            for(int i=0;i<n;i++){
                System.out.print("arr["+i+"]= ");
                arr[i]=sc.nextInt();
            }
            for(int i=1;i<n;i++){
                int curr=arr[i];
                int j=i-1;
                while(j>=0 && arr[j]>curr){
                        arr[j+1]=arr[j];
                        j--;
                    }
                    arr[j+1]=curr;
                }
            System.out.print("Sorted array: ");
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
}

