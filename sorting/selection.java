package sorting;

import java.util.Scanner;

public class selection {
        public static void main(String[] args) {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.print("Enter the size of array to be sorted: ");
                int n=sc.nextInt();
                int arr[]=new int[n];
                int temp;
                System.out.println("enter the elements of array one by one: ");
                for(int i=0;i<n;i++){
                    System.out.print("arr["+i+"]= ");
                    arr[i]= sc.nextInt();
                }
                for(int i=0;i<n-1;i++){
                    for(int j=i+1;j<n;j++){
                        int smallest = i;
                        if(arr[j] < arr[smallest]){
                            temp= arr[smallest];
                            arr[smallest]= arr[j];
                            arr[j]= temp;
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
