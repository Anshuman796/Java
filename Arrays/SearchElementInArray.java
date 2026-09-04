package Arrays;

import java.util.Scanner;

public class SearchElementInArray {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter The Size Of Array: ");
        int n= sc.nextInt();

        int [] arr= new int[n];
        System.out.println("Enter Your Array Element: ");

        for(int i=0;i<=n-1;i++){
            arr[i]= sc.nextInt();
        }

        System.out.print("Enter The Element You Want To Search: ");
        int search = sc.nextInt();

        for(int i=0;i<=n-1;i++){
            if(arr[i]==search){
                System.out.print("Element Found: "+arr[i]);
                break;
            }
            else{
                System.out.print("Element Not Found: ");
            }
        }


        sc.close();
    }  
}
