package arrays;

import java.util.Scanner;

public class spiralordermat {
    public static void main(String[] args) {
            try (Scanner s = new Scanner(System.in)) {
                System.out.print("Enter array row-length: ");
                int r=s.nextInt();
                System.out.print("Enter array column-length: ");
                int c=s.nextInt();
                int arr[][]=new int[r][c];
                System.out.println("enter the elements of the array: ");
                for(int i=0;i<r;i++){
                    for(int j=0;j<c;j++){
                        System.out.print("arr["+i+"]["+j+"] : ");
                        arr[i][j]=s.nextInt();
                    }
                }

                int row_start=0,row_end=r-1,col_start=0,col_end=c-1;
                while(row_start<=row_end && col_start<=col_end){
                for(int i=col_start;i<=col_end;i++){
                    System.out.print(arr[row_start][i]+" ");
                    row_start++;
                    }
                for(int i=row_start;i<=row_end;i++){
                    System.out.print(arr[i][col_end]+" ");
                    col_end--;
                    }
                for(int i=col_end;i>=col_start;i--){
                    System.out.print(arr[row_end][i]+" ");
                    row_end--;
                    }
                for(int i=row_end;i>=row_start;i--){
                    System.out.print(arr[i][col_start]+" ");
                    col_start++;
                    }
                }
            }
    }
}


