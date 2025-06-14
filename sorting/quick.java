package sorting;

import java.util.Scanner;

public class quick {
    public static int Partition(int arr[],int low,int high){
        int pivot= arr[high];
        int i= low - 1;
        for(int j= low; j <= high; j++){
            if(arr[j] <= pivot){
                i++;
                int temp= arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
            }
        }
        return i;
    }

    public static void Quicksort(int arr[],int low,int high){
        if(low < high){
            int pivot= Partition(arr,low,high);
            Quicksort(arr, low, pivot-1);
            Quicksort(arr, pivot+1, high);
        }
    }
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of array to be sorted: ");
            int n=sc.nextInt();
            int arr[]=new int[n];
            System.out.println("enter the elements of array one by one: ");
            for(int i=0;i<n;i++){
                System.out.print("arr["+i+"]= ");
                arr[i]=sc.nextInt();
            }
            Quicksort(arr,0,n-1);
            //print
            for(int i=0; i<n;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
