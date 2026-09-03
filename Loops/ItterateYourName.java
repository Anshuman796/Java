package Loops;

import java.util.Scanner;

public class ItterateYourName {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number Of Times You Want To itterate: ");
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("Anshuman Singh");
        }

        sc.close();
    }
}
