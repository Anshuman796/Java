package Arrays;

import java.util.Scanner;

public class SecondMaximumElementOfArray {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Your Array Size: ");
        int n = sc.nextInt();

        int [] arr = new int[n];
        System.out.println("Enter Your Array Elements: ");

        for(int i=0;i<=n-1;i++){
            arr[i]= sc.nextInt();
        }
        int mx =Integer.MIN_VALUE;

        for(int i=0;i<=n-1;i++){
            if(arr[i]>mx){
                mx=arr[i];
            }
        }

        int smx= Integer.MIN_VALUE;
        for(int i=0;i<=n-1;i++){
            if(arr[i]>smx && arr[i]!=mx){
                smx=arr[i];
            }
        }

        System.out.print(smx);

        sc.close();
    }
}
