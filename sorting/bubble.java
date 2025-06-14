package sorting;

import java.util.Scanner;

public class bubble {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of array to be sorted: ");
            int n=sc.nextInt();
            int arr[]=new int[n];
            int temp;
            System.out.println("enter the elements of array one by one: ");
            for(int i=0;i<n;i++){
                System.out.print("arr["+i+"]= ");
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<n-1;i++){
                for(int j=0;j<n-i-1;j++){
                    if(arr[j]>arr[j+1]){
                        temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
            System.out.print("Sorted array: ");
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
