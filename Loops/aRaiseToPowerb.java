package Loops;

import java.util.Scanner;

public class aRaiseToPowerb {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Value Of a: ");
        int a = sc.nextInt();
        System.out.print("Enter Value Of b: ");
        int b = sc.nextInt();

        int result=1;
        for(int i=1;i<=b;i++){
            result*=a;
        }
        System.out.print(result);

        sc.close();
    }   
}
