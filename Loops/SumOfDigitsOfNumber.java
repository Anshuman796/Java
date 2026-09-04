package Loops;

import java.util.Scanner;

public class SumOfDigitsOfNumber {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int n= sc.nextInt();
        int sum = 0;

        while(n!=0){
            int lastdigit = n%10;
            sum+=lastdigit;
            n=n/10;
        }
        System.out.print(sum);

        sc.close();
    }
}
