package sorting;

import java.util.Scanner;

public class merge {
    
    public static void conquer(int arr[],int low,int high,int mid){

        int mergeit[]= new int[high-low +1];
        int idx1= low;
        int idx2= mid+1;
        int x= 0;

        while(idx1<=mid && idx2<=high){
            if(arr[idx1] <= arr[idx2])
                mergeit[x++] = arr[idx1++];
            else
                mergeit[x++] = arr[idx2++];
        }
        while(idx1 <= mid)
            mergeit[x++] = arr[idx1++];
        while(idx2 <= high)
            mergeit[x++] = arr[idx2++];

        for(int i= 0,j= low; i< mergeit.length; i++,j++)
            arr[j] = mergeit[i];
    }

    public static void divide(int arr[],int low,int high) {
        if(low < high){
            int mid = low + (high-low)/2;
            divide(arr, low, mid);
            divide(arr, mid+1, high);
            conquer(arr, low, high, mid);
        }
    }

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
            divide(arr,0,n-1);
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
