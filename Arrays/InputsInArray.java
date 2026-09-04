package Arrays;

import java.util.Scanner;

public class InputsInArray {
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Array Size: ");
        int n= sc.nextInt();

        int [] arr = new int[n];
        System.out.println("Enter Your Array Element: ");
        for(int i=0;i<=n-1;i++){
            arr[i]=sc.nextInt();

        }

        for(int i=0;i<=n-1;i++){
            System.out.print(arr[i]+" ");
        }

        sc.close();

    } 
}
