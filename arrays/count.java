package arrays;

import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter the number of inputs u want: ");
            int n=s.nextInt();
            int arr[]=new int[n];
            int count_p=0,count_n=0,count_z=0;
            for(int i=0;i<n;i++){
                System.out.print("arr["+i+"] : ");
                arr[i]=s.nextInt();
            }
            for(int num : arr){
                if(num>0)
                count_p++;
                else if(num<0)
                count_n++;
                else
                count_z++;
            }
            System.out.println("positive numbers: "+count_p);
            System.out.println("negative numbers: "+count_n);
            System.out.println("number of zeros : "+count_z);
        }
    }
}
