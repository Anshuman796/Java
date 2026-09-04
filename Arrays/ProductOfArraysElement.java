package Arrays;

import java.util.Scanner;

public class ProductOfArraysElement {
   public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Your Array Size: ");
        int n = sc.nextInt();

        int [] arr = new int[n];
        System.out.println("Enter Your Array Elements: ");

        for(int i=0;i<=n-1;i++){
            arr[i]= sc.nextInt();
        }
        int product =1;

        for(int i=0;i<=n-1;i++){
            product*=arr[i];
        }

        System.out.print(product);

        sc.close();
    }  
}
